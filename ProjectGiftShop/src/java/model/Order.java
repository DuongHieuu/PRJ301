/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author dthie
 */
public class Order {
        int orderid;
    int custid;
    int accountorderid;
    Date orderDate;

    public Order() {
    }

    public Order(int orderid, int custid, int accountorderid, Date orderDate) {
        this.orderid = orderid;
        this.custid = custid;
        this.accountorderid = accountorderid;
        this.orderDate = orderDate;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public int getAccountorderid() {
        return accountorderid;
    }

    public void setAccountorderid(int accountorderid) {
        this.accountorderid = accountorderid;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


}
