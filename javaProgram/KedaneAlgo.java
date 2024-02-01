package com.javaProgram;

public class KedaneAlgo {

    public static void main(String[] args) {

        int[] arr = new int[]{-1, -2, -4, 4, 2, 9, -7, 0, 2, 5};
      int startIndex = 0,endIndex = 0,s=0;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < n; i++) {
            currsum = currsum + arr[i];

            if (maxSum < currsum) {
                maxSum = currsum;
                startIndex=s;
                endIndex=i;
            }
            if (currsum < 0) {
                currsum = 0;
                s=i+1;
            }

        }
        System.out.println( startIndex);
        System.out.println(endIndex);
        System.out.println(maxSum);

    }
}
