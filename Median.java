package com;

public class Median {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 50, 6, 7, 8};
        int k = arr.length / 2;
        System.out.println(k);
        if (arr.length % 2 == 0) {

            int firstVal = k;
            int Val = k -1;
            double med = (arr[firstVal] + arr[Val]) / 2;
            System.out.println(med);

        } else {
            int med = k;
            System.out.println(arr[med]);
        }


    }
}
