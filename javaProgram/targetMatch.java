package com.javaProgram;

public class targetMatch {
    public void targetMatch(int arr[]){
        int target=88;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                System.out .println("target matched in array");
            }
        }
        System.out.println("target not matched");
    }
    public static void main(String[] args){
        int [] arr= new int[]{1,2,0,-1,7,8};
        new targetMatch().targetMatch(arr);
    }
}
