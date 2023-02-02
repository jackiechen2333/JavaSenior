package com.cx.exer1;

import java.awt.*;

/**
 * @Author cx
 * @Date 2023/02/02/16:11
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor = new Productor(clerk);
        Customer customer = new Customer(clerk);

        productor.setName("生产者1");
        customer.setName("消费者1");

        productor.start();
        customer.start();
    }
}
