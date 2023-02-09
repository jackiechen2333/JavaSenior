package com.cx.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cx
 * @Date 2023/02/08/8:36
 */
public class Order<T> {
    String orderName;
    int orderId;

    T orderT;

    public Order() {
    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> arrayList = new ArrayList<>();

        for (E e: arr){
            arrayList.add(e);
        }

        return arrayList;
    }
}
