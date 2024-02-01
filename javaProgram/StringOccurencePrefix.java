package com.javaProgram;

public class StringOccurencePrefix {


    public void sol(String  s) {
        String result ="";
        int count=1;
        for (int i=0; i< s.length(); i++) {
            if ( i < s.length()-1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }else  {
                result = result + s.charAt(i)+count;
                count=1;
            }

        }
        System.out.println(result);
    }

    public static void main(String[] arg) {
        new StringOccurencePrefix().sol("aaabbcddeeee");
    }
}
