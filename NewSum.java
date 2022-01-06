package com;

public class NewSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,0,1,3,1};

        int iSum=0;
        for(int i=0; i<arr.length; i++)
        {
            iSum=iSum+arr[i];
            int newSum=0;
            for(int j=i+2; j<arr.length; j++)

            {
                newSum=newSum+arr[j];
            }
            if(newSum==iSum){
                System.out.println(i+1);
                return;
            }

        }
        System.out.println(-1);
}}
