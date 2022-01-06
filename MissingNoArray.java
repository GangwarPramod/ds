package com;

public class MissingNoArray {
  static   int[] arr = {3, 4, 6, 8,9};

public static void reverse(int[] arr,int i, int j)
{
   while (i<j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
       i++;
       j--;
   }



}
    public static void rotate(int[] arr, int k){
   k=k%arr.length;
        if(k!=0){
            reverse(arr,0,k-1);
            reverse(arr,k, arr.length-1);
            reverse(arr,0,arr.length-1);

        }
        for(int l=0; l<arr.length; l++){
            System.out.print(arr[l]);
        }


    }

public static void main (String [] args){
    rotate(arr,3);

}

}
