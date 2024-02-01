package com.javaProgram;

public class ReverseString {
    public static void main (String[] args){
        String s="this is pramod "; // domarp si siht
        String s1="this is pramod "; // pramod is this
        String s3="this is my hometown";

        String[] s4=s3.split(" ",5);
        String revNew="";

        for(int i=0;i<=s4.length-1;i++){

            if (i==s4.length-1){
                revNew=s4[i]+revNew;
            }else
            {
                revNew = " " + s4[i]+revNew;
            }
        }
        System.out.println(revNew);









//        String [] s2=s1.split(" ",3);
//        for (int i= s2.length-1; i>=0; i--) {
//            String rev = s2[i];
//            String finalRev ="";
//            for(int k=rev.length()-1; k>=0; k-- ){
//                finalRev = finalRev+rev.charAt(k);
//            }
//            System.out.print(finalRev);
//            System.out.print(" ");
//
//        }

        String rev="";
        char []ch=new char[s.length()];
        for(int j=0;j<s.length();j++)
        {
            ch[j]= s.charAt(j);

        }
        for(int i=ch.length-1; i>=0;i--)
        {
            char c = ch[i];
            System.out.print(c);
       }

    }
}
// 1 0 1 0 1 0
