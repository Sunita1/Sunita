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
public class Product {
    private int productId;
    private String productName;
     private String productPrice;
    private Boolean productStatus;

    public Product() { }

    public Product(int productId, String productName, String productPrice, Boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public Boolean isProductStatus() {
        return productStatus;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }
    
   @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + ", productStatus=" + productStatus + '}';
    }
   
    
    
}
