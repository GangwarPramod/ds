package com;

public class MergeArray {
    public static void main(String []args){
        int [] arr1=new int[] {4,12,15};
        int[]  arr2= new int[] {1,2,3,11,14,16};
        int[] output = mergeTwoSortedArray(arr1,arr2);
        for (int i=0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }
    }
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){

        int j=0; int l1=arr1.length;
        int k= 0; int l2=arr2.length;
        int[] res=new int [l1+l2];
        int index=0;
        while(j<l1 && k<l2){
              if(arr1[j]<arr2[k]){
                  res[index]=arr1[j];
                  j++;
              }else{
                  res[index]=arr2[k];
                  k++;
              }
            index++;
        }
        while(j<l1){
            res[index]=arr1[j];
            j++;
            index++;
        }
        while(k<l2) {
            res[index] = arr2[k];
            k++;
            index++;
        }
        return res;
    }
}
