package com;

public class ReverseString {
    public static void main (String[] args){
        String s="this is pramod "; // domarp si siht
        String s1="this is pramod "; // pramod is this

        String [] s2=s1.split(" ",4);
        for (int i= s2.length-1; i>=0; i--) {
            String rev = s2[i];
            String finalRev ="";
            for(int k=rev.length()-1; k>=0; k-- ){
                finalRev = finalRev+rev.charAt(k);
            }
            System.out.print(finalRev);
            System.out.print(" ");
            
        }
        //System.out.println();
        //String rev="";
        /*char []ch=new char[s.length()];
        for(int j=0;j<s.length();j++)
        {
            ch[j]= s.charAt(j);

        }
        System.out.println(ch);
        for(int i=ch.length-1; i>=0;i--)
        {
            char c = ch[i];
            System.out.print(c);
       }*/

    }
}
// 1 0 1 0 1 0
