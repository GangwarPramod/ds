package com;

import java.util.Locale;

public class NameQuestion {
    public static void main(String[]args){
        String s= "pramod";
        for(int i=0; i <s.length();i++){
            char ch= s.charAt(i);
            int pos=ch-'a';
            System.out.println(pos);
        }

    }




}
