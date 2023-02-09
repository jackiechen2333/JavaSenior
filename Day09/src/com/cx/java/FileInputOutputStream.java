package com.cx.java;

import org.junit.Test;

import java.io.*;

/**
 * @Author cx
 * @Date 2023/02/09/21:03
 */
public class FileInputOutputStream {
    @Test
    public void test() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File srcFile = new File("字.png");
            File destFile = new File("字1.png");

            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            byte[] buffer = new byte[5];
            int len;
            while((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if ((fileOutputStream != null))
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
