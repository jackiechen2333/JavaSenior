package com.cx.java2;

import org.junit.Test;

import java.io.File;
import java.util.Date;

/**
 * @Author cx
 * @Date 2023/02/08/17:58
 */
public class FileTest {

    @Test
    public void test(){
        File file1 = new File("hello.txt");
        File file2 = new File("d:\\io\\hi.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println(new Date(file1.lastModified()));
        System.out.println( );
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

    }

    @Test
    public void test1(){
        File file = new File("E:\\WorkSpace\\JavaSenior");

        String[] list = file.list();
        for (String s : list){
            System.out.println(s);
        }

        System.out.println();

        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f);
        }
    }
}
