package com.javaProgram;

public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 12, 53, 66, 75, 78,100,34,12};
        getSecondMax(arr);
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);

    }
    public static void getSecondMax(int[] arr){
    int res=-1;
    int largest=0;
    for(int i=1; i<arr.length;i++){
        if(arr[i]>arr[largest]){
            res=largest;
            largest=i;
        }
        else if (arr[i]!=arr[largest]){

         if (res==-1|| arr[i]>arr[res]) {
             res=i;
         }
        }
        }
        System.out.println(arr[res]);
    }

    }
