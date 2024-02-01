package com.javaProgram;

public class PairSuminOneLoop {
    public static void main(String[] args) {
        int[] arr = new int[]{4,7,8,15,9,6,9,7};
        int target=13;
        boolean flag=false;
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int k=arr[i];
            int l=arr[j];
           int sum=k+l;
            if(target==sum)
            {
                arr[0]=arr[i];
                arr[1]=arr[j];
                flag=true;
                break;
            }else if(sum>target)
            {
                j--;
            }else{
                i++;
            }
        }
        if(flag){
            System.out.println(arr[0]);
            System.out.println(arr[1]);
        }else{
            System.out.println("pair not present");
        }



}
}

