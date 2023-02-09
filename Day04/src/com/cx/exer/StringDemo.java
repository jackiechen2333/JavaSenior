package com.cx.exer;

import javafx.beans.binding.StringBinding;
import org.junit.Test;

/**
 * @Author cx
 * @Date 2023/02/03/21:46
 */
public class StringDemo {
    public String reverse(String string,int startIndex,int endIndex){

        if(string != null){
            char[] arr = string.toCharArray();
            for (int x = startIndex,y = endIndex;x < y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    public String reverse1(String string,int startIndex,int endIndex){

        if (string != null){
            StringBuilder stringBuilder = new StringBuilder(string.length());
            stringBuilder.append(string.substring(0,startIndex));
            for (int i = endIndex;i >= startIndex;i--){
                stringBuilder.append(string.charAt(i));
            }
            stringBuilder.append(string.substring(endIndex + 1));
            return stringBuilder.toString();
        }
        return null;
    }

    @Test
    public void testReverse(){
        String s = "abcdefg";
        String reverse = reverse(s, 2, 5);
        System.out.println(reverse);

        String s1 = "abcdefg";
        String reverse1 = reverse1(s1, 2, 5);
        System.out.println(reverse1);

    }
}
