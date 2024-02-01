package com.javaProgram;

public class duplicate {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[]{1, 1,2, 4, 5, 6, 7, 7};//2456

        for (int i = 0; i < arr.length; i++) {
            boolean flag =false;

            for (int j =0; j < arr.length; j++) {

                if (i!=j && arr[i] == arr[j]) {
                  flag=true;
                  break;
                }

            }
            if (!flag){
                System.out.println(arr[i]);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
