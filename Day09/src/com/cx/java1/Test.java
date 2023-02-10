package com.cx.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author cx
 * @Date 2023/02/10/11:12
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
    }
}
