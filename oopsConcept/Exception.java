package com.oopsConcept;

public class Exception {

    public static String getException(){

        try
        {
          System.out.println("it will executed");

          return "xyz";
        }
        finally {
            System.out.println("it will also executed");
        }
    }
    public static void main(String[]args){
        System.out.println(getException());
    }
}
