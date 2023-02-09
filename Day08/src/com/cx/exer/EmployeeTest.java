package com.cx.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author cx
 * @Date 2023/02/07/16:12
 */
public class EmployeeTest {

    @Test
    public void test2(){
        TreeSet<Empolyee> set = new TreeSet<Empolyee>(new Comparator<Empolyee>() {
            @Override
            public int compare(Empolyee o1, Empolyee o2) {
                MyDate myDate1 = o1.getBirthday();
                MyDate myDate2 = o2.getBirthday();

                int minYear = myDate1.getYear() - myDate2.getYear();
                if (minYear != 0){
                    return minYear;
                }

                int minMonth = myDate1.getMonth() - myDate2.getMonth();
                if (minMonth != 0){
                    return minMonth;
                }

                return myDate1.getDay() - myDate2.getDay();
            }
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1 instanceof Empolyee && o2 instanceof Empolyee){
//                    Empolyee empolyee1 = new Empolyee();
//                    Empolyee empolyee2 = new Empolyee();
//
//                    MyDate myDate1 = empolyee1.getBirthday();
//                    MyDate myDate2 = empolyee2.getBirthday();
//
//                    int minYear = myDate1.getYear() - myDate2.getYear();
//                    if (minYear != 0){
//                        return minYear;
//                    }
//
//                    int minMonth = myDate1.getMonth() - myDate2.getMonth();
//                    if (minMonth != 0){
//                        return minMonth;
//                    }
//
//                    return myDate1.getDay() - myDate2.getDay();
//                }
//                throw new RuntimeException("传入的数据不一致");
//            }
        });

        Empolyee e1 = new Empolyee("liudehua",55,new MyDate(1965,5,4));
        Empolyee e2 = new Empolyee("zhangxueyou",43,new MyDate(1987,5,4));
        Empolyee e3 = new Empolyee("guofucheng",44,new MyDate(1987,5,9));
        Empolyee e4 = new Empolyee("liming",51,new MyDate(1954,8,12));
        Empolyee e5 = new Empolyee("liangzhaowei",21,new MyDate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Empolyee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Empolyee next = iterator.next();
            System.out.println(next);
        }

    }

    @Test
    public void test1(){
        TreeSet<Empolyee> set = new TreeSet<Empolyee>();

        Empolyee e1 = new Empolyee("liudehua",55,new MyDate(1965,5,4));
        Empolyee e2 = new Empolyee("zhangxueyou",43,new MyDate(1987,5,4));
        Empolyee e3 = new Empolyee("guofucheng",44,new MyDate(1987,5,9));
        Empolyee e4 = new Empolyee("liming",51,new MyDate(1954,8,12));
        Empolyee e5 = new Empolyee("liangzhaowei",21,new MyDate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Empolyee> iterator = set.iterator();
        while (iterator.hasNext()){
            Empolyee next = iterator.next();
            System.out.println(next);
        }

    }
}
