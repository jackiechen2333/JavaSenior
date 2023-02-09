package com.cx.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author cx
 * @Date 2023/02/09/20:38
 */
public class FileReaderWriterTest {
    @Test
    public void test(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("hello1.txt");

            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);

            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1){
                fileWriter.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader != null)
            fileReader.close();
            } catch (IOException e) {
            e.printStackTrace();
            }

            try {
                if (fileWriter !=null)
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
