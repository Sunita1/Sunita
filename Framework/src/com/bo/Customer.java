/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bo;

/**
 *
 * @author Ulquiorra Schiffer
 */
public class Customer {
    
    private static int customerId;
    private static String customerName;
    private static String customerPhone;
    private static String customerAddress;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerPhone, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(int customerId) {
       customerId = customerId;
    }

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customeName) {
        customerName = customeName;
    }

    public static String getCustomerPhone() {
        return customerPhone;
    }

    public static void setCustomerPhone(String customePhone) {
        customerPhone = customePhone;
    }

    public static  String getCustomerAddress() {
        return customerAddress;
    }

    public static void setCustomerAddress(String customeAddress) {
        customerAddress = customeAddress;
    }

    
    public static String tString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", customerPhone=" + customerPhone + ", customerAddress=" + customerAddress + '}';
    }
    
   public String toCSV(){
       return customerId + "," + customerName + "," + customerPhone + "," + customerAddress +"\r\n";
   }
    
}
