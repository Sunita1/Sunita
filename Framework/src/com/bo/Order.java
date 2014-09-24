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
public class Order {
    private int orderId;
    private String orderDate;
    private String orderType;

    public Order() {
    }

    public Order(int orderId, String orderDate, String orderType) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderType = orderType;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", orderDate=" + orderDate + ", orderType=" + orderType + '}';
    }
    
    
}
