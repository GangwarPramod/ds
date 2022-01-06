package com;

public class Maxmin {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 19, 8, 26, 2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max2=0;
        int min2=0;
        int max3=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max3 = max2;
                max2 = max;
                max = arr[i];
            }else if(arr[i]>max2){
                max3 = max2;
                max2= arr[i];

            }else if(max3<arr[i]){
                max3=arr[i];
            }


            if(arr[i]<min){
                min2=min;
                min=arr[i];
            }else if(min2<arr[i]){
                min2=arr[i];
            }
        }
        System.out.print(max+ " ");
        System.out.println(max2);
       System.out.println(max3);
        System.out.println(min);
        System.out.println(min2);
    }

}
