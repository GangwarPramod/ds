package com.javaProgram;

public class primeNo {
    public void findPrime(int n) {

        for (int i = 1; i < n; i++) {
            boolean isPrime = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        new primeNo().findPrime(100);
    }
}
