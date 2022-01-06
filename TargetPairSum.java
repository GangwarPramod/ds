package com;

public class TargetPairSum {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3};
        int target = 5;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
          for(int j=0;j<arr.length;j++){
              if (i==j){
                  continue;
              }
              int  sum =arr[i]+arr[j];
                if (target == sum)
                {
                    arr[0] = i;
                    arr[1] = j;
                    flag = true;
                    break;

                }


            }

            if(flag){
                break;
            }

        }
        if(flag){
            System.out.println(arr[0]);
            System.out.println(arr[1]);
        }else {
            System.out.println(false);
        }

    }
}