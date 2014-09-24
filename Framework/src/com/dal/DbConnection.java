/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dal;

import java.sql.Connection;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Ulquiorra Schiffer
 */
public class DbConnection {
    
    private Connection connection=null;
    private Statement stmt=null;
    String url="",username="",password="";

    public DbConnection() throws ClassNotFoundException, IOException
    {
        Properties p=new Properties();
        p.load(new FileReader(new File("config.properties")));
        
        String driver=p.getProperty("DRIVER");
        url=p.getProperty("URL");
        username=p.getProperty("USERNAME");
        password=p.getProperty("PASSWORD");
        
        Class.forName(driver);
        
    }
    
    public void open() throws SQLException{

       connection= (Connection) DriverManager.getConnection(url,username,password);
    }
    
    public int execute(String sql) throws SQLException{
        stmt=connection.createStatement();
        return stmt.executeUpdate(sql);
    }
    
    public ResultSet executeQuery(String sql) throws SQLException{
        stmt=connection.createStatement();
        return stmt.executeQuery(sql);
    }
    
   
    
    public void close() throws SQLException{
        if(connection!=null){
            connection.close();
            connection=null;
        }
    }
}
