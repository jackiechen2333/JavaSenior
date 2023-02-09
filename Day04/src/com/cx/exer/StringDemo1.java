package com.cx.exer;

import org.junit.Test;

/**
 * @Author cx
 * @Date 2023/02/04/10:10
 */
public class StringDemo1 {
    public int getCount(String mainString,String subString){
        int mainLength = mainString.length();
        int subLength = subString.length();
        int count = 0;
        int index = 0;
        if(mainLength >= subLength){

//            while ((index = mainString.indexOf(subString)) != -1){
//                count++;
//                mainString = mainString.substring(index + subString.length());
//            }

            while ((index = mainString.indexOf(subString,index)) != -1){
                count++;
                index +=subLength;
            }


            return count;
        }else {
            return 0;
        }
    }

    @Test
    public void testGetCount(){
        String mainStr = "abkkcadkabkebfkaabkskab";
        String substr = "ab";
        int count = getCount(mainStr,substr);
        System.out.println(count);

    }
}

