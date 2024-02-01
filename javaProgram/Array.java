package com.javaProgram;

public class Array {
    public static void main(String[] args){
        int [] arr= new int[]{0,0,1,1,1,1};
        int count1=0;
        int count2=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count1++;
            }
            if(arr[i]==1){
                count2++;
            }

        }
        System.out.println(count1);
        System.out.println(count2);
        for(int j=0; j<arr.length; j++){
            if(count1 >0){
                arr[j]=0;
                count1--;
                continue;
            }

            if(count2 >=0){
                arr[j]=1;
                count2--;
            }

        }

        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");

        }

    }

}
