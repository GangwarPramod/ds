package com.javaProgram;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[]args){
        String str1="Pramod";
        String str2= "Shaily";
        String str3="";
        int i= 0; int l1=str1.length();
        int j = 0; int l2=str2.length();
        while(i<l1 &&j<l2)
        {
            char p= str1.charAt(i);
            char s=str2.charAt(j);
            str3= str3+p+s;
         i++;
         j++;
        }
        if(i<l1){
            str3=str3+str1.substring(i);
        }
        if(j<l2){
            str3=str3+str2.substring(j);
        }
        System.out.print(str3);
    }
}
