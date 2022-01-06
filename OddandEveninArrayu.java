package com;

public class OddandEveninArrayu {
    static int evencount=0;
    static int oddcount=0;
    public static void oddVsEven(int [] arr){
        for(int i=0;i<arr.length; i++)
        {

            if(arr[i]%2==0){
                evencount++;

            }else if(arr[i]%2==1){
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
    public static void main(String[]args){
        int [ ] arr= new int[] {2,4,5,6,7,8};
        oddVsEven(arr);
    }
}
