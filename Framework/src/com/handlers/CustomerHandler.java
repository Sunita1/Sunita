package com.handlers;
import com.bo.Customer;
import com.dal.DbConnection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ulquiorra Schiffer
 */
public class CustomerHandler {
    
    public static int insert(Customer customer) throws ClassNotFoundException, SQLException, IOException{
       // Customer customer=new Customer();
        DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="INSERT INTO Customers(customer_name,customer_phone,customer_address) VALUES('"+customer.getCustomerName()+"','"+customer.getCustomerPhone()+"','"+customer.getCustomerAddress()+"')";
        
        int result =conn.execute(sql);
        conn.close();
        return result;
    }
    
    public static int Update() throws ClassNotFoundException, SQLException, IOException{
        Customer customer=new Customer();
        DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="UPDATE Customers set customer_name='"+customer.getCustomerName()+"',customer_phone='"+customer.getCustomerPhone()+"',customer_address='"+customer.getCustomerAddress()+"' WHERE customer_id=" + customer.getCustomerId();
        
        int result =conn.execute(sql);
        conn.close();
        return result;
    }    

     public static int Delete(int customerId) throws ClassNotFoundException, SQLException, IOException{
        DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="DELETE FROM Customers  WHERE customer_id=" + customerId;
        
        int result =conn.execute(sql);
        conn.close();
        return result;
    } 
     
     public static ArrayList<Customer> getAll() throws ClassNotFoundException, SQLException, IOException
     {
         ArrayList<Customer> customers=new ArrayList<Customer>();
         DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="SELECT * FROM Customers";
        ResultSet rs=conn.executeQuery(sql);
        while(rs.next()){
            Customer c=new Customer();
            c.setCustomerId(rs.getInt("customer_id"));
            c.setCustomerName(rs.getString("customer_name"));
            c.setCustomerPhone(rs.getString("customer_phone"));
            c.setCustomerAddress(rs.getString("customer_address"));
            customers.add(c);
        }
        conn.close();
        
        return customers;
     }
     
     public static Customer getById(int customerId) throws ClassNotFoundException, SQLException, IOException
     {
        Customer customer=null;
         DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="SELECT * FROM Customers WHERE customer_id=" + customerId;
        ResultSet rs=conn.executeQuery(sql);
        while(rs.next()){
            customer=new Customer();
            customer.setCustomerId(rs.getInt("customer_id"));
            customer.setCustomerName(rs.getString("customer_name"));
            customer.setCustomerPhone(rs.getString("customer_phone"));
            customer.setCustomerAddress(rs.getString("customer_address"));
           
        }
        conn.close();
        
        return customer;
     }     
    
}
