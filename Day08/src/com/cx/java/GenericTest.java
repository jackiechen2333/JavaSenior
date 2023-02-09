package com.cx.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author cx
 * @Date 2023/02/08/8:39
 */
public class GenericTest {

    @Test
    public void test1(){
        Order objectOrder = new Order();
        objectOrder.setOrderT(123);
        objectOrder.setOrderT("ABC");

        Order<String> order1 = new Order<String>("orderAA",1001,"orderAA:1001");

        order1.setOrderT("AA:orderAA");
    }

    @Test
    public void test2(){
        SubOrder subOrder = new SubOrder();
        subOrder.setOrderT(111);
    }

    @Test
    public void test3(){
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        List<Integer> integers = order.copyFromArrayToList(arr);
        System.out.println(integers);
    }

    @Test
    public void test4(){
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        List<?> list = null;

        list = list1;
        list = list2;
    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());;
        }
    }
}
