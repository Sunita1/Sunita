/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import com.bo.Customer;
import com.handlers.CustomerHandler;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import com.dal.DbConnection;
import java.io.InputStreamReader;


/**
 *
 * @author Ulquiorra Schiffer
 */
public class Programbackup {

    
    public static void sample() throws ClassNotFoundException, SQLException {
       
        
        
        
        String check="y",choice="";
        BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));
      while(check.toUpperCase().equals("Y"))
        {
            System.out.println("**********MENU***********");
            System.out.println("0.load CSV file to database:");
            System.out.println("1.Insert:");
            System.out.println("2.Search:");
            System.out.println("3.Show All:");
            System.out.println("4.Update:");
            System.out.println("5.Delete:");
            System.out.println("6.Exit");
              
            System.out.println("Enter ur choice:");
        try{
            choice= brr.readLine();
            int parseChoice=Integer.parseInt(choice);
        switch(parseChoice)
            {
            case 0:
                try 
                {
                BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Ulquiorra Schiffer\\Documents\\NetBeansProjects\\Framework\\csv file\\customers.txt"));
                 String line="", broken="", gooddata="";
                 StringBuilder builderBroken=new StringBuilder();
                try
                {
                while((line=br.readLine())!=null)
                    {   
                     String[] tokens=line.split(",");
                     if(tokens.length>=4)
                     {
                        // System.out.println(tokens[1]+","+tokens[2]+","+tokens[3]);
                        Customer.setCustomerName(tokens[1]);
                        Customer.setCustomerPhone(tokens[2]);
                        Customer.setCustomerAddress(tokens[3]);
                        CustomerHandler.insert();
                        //System.out.println(Customer.tString());
                     }
                    }  
                }  
                catch (IOException ex) 
                {
                System.out.println(ex.getMessage());
                }
                } 
                catch (FileNotFoundException ex) 
                {
                    System.out.println(ex.getMessage());
                }
                System.out.println("csv file copied to database");
                break;
            
            case 1:
                System.out.println("enter the customer name:");
                Customer.setCustomerName(brr.readLine());
                System.out.println("enter the customer phone:");
                Customer.setCustomerPhone(brr.readLine());
                 System.out.println("enter the customer address:");
                Customer.setCustomerAddress(brr.readLine());
                CustomerHandler.insert();
                break;
                
            case 2:
               
            case 3:
                
            case 4:
                Customer customer=new Customer();
                System.out.println("enter the customerId to update:");
               String sid=brr.readLine();
               int iid=Integer.parseInt(sid);
                    
                Customer.setCustomerId(iid);
                 System.out.println("enter the customer name:");
                Customer.setCustomerName(brr.readLine());
                System.out.println("enter the customer phone:");
                Customer.setCustomerPhone(brr.readLine());
                 System.out.println("enter the customer address:");
                Customer.setCustomerAddress(brr.readLine());
                System.out.println(customer.getCustomerId());
//                        System.out.println(customer.getCustomerPhone());
//                                System.out.println(customer.getCustomerAddress());
                CustomerHandler.Update();
                break;
            case 5:    
            
            case 6:
                System.out.println("exiting....");
                   //exit
            }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
         
        }
    }
       
        
    }
    


/*
package com;

import com.bo.Customer;
import com.handlers.CustomerHandler;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import com.dal.DbConnection;

/**
 *
 * @author Ulquiorra Schiffer
 
public class Programbackup {

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c=new Customer();
        c.setCustomerId(9);
        c.setCustomerName("Dixanta test Shrestha");
        c.setCustomerPhone("9999999999");
        c.setCustomerAddress("Patan");
        
        try 
        {
            CustomerHandler.Delete(21);
            ArrayList<Customer> customers=CustomerHandler.getAll();
            for(Customer cc : customers){
                System.out.println(cc.toString());
            }
            Customer cc=CustomerHandler.getById(6);
            if(cc!=null){
                System.out.println(cc.toString());
            }
            else
            {
                System.out.println("Record Not Found");
            }
        }  
        catch (Exception ex) 
        {
             System.out.println(ex.getMessage());
            //Logger.getLogger(Programbackup.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }
    
}
*/