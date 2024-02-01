package com.javaProgram;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceStringChar {

    public static char getChar(String s){
        Map<Character,Integer>mp=new HashMap<>();
        int freq=0;
        char ans=0;
        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);

         if(freq<mp.get(c)){
           ans=c;
           freq=mp.get(c);
         }
        }

return ans;
    }
    public static void main (String [] args){
        String s="aabbbbaaasxwaa";
        System.out.println(getChar(s));
    }
}
