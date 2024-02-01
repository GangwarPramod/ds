package com.oopsConcept;

import java.util.Scanner;

public interface interfaceLearn {
    public void m1();
    public void m2();
}
class ServiceProvider implements interfaceLearn{
    public void m1(){

    }
    public void m2(){

    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if(A==B&&B==C||A==C){
            System.out.println("equilateral");
        }else
        {
            System.out.println("scalene");
        }
    }
}