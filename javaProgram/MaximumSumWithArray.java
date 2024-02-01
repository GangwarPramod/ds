package com.javaProgram;

public class MaximumSumWithArray {

    public static void main(String[]args){
        int [] arr=new int[]{2,5,6,11,8,3,4,3,15};
        int k=3;

        int max_sum=0;
      for(int i=0;i<k;i++){
          max_sum=max_sum+arr[i];
      }
      int window_sum=max_sum;
      for(int j=k;j<arr.length-k+1;j++){

          window_sum= window_sum+arr[j]-arr[j-k];
          max_sum=Math.max(max_sum,window_sum);

          }
      System.out.println(max_sum);
    }



    public class secondLargest {

        public static int getSecond(int[] arr) {
            int firstlargest = Integer.MIN_VALUE;int secondlargest = Integer.MIN_VALUE;


            if (arr.length<2){
                System.out.println();

            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>firstlargest){
                    secondlargest=firstlargest;
                    firstlargest=arr[i];
                }
                else if(arr[i]>secondlargest && arr[i]!=firstlargest) {
                    secondlargest = arr[i];
                }
//            }
//     if(secondlargest==Integer.MIN_VALUE){
//         System.out.println("no second element");
////      }
////      else {
////          System.out.println("second present");
//      }

            }
            return secondlargest;
        }
        public static void main(String[]args){
            int []arr=new int[]{6,7,2,3,7};
            System.out.println(getSecond(arr));
        }
    }

}
