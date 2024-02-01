package com.javaProgram;

import java.util.HashSet;
import java.util.Set;

public class TargetPairSum {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int target = 5;
        boolean flag = false;
        getPair(arr, 4);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                int sum = arr[i] + arr[j];
                if (target == sum) {
                    arr[0] = i;
                    arr[1] = j;
                    flag = true;
                    break;

                }


            }

            if (flag) {
                break;
            }

        }
        if (flag) {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
        } else {
            System.out.println(false);
        }

    }

    public static void getPair(int[] arr, int k) {
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = k - arr[i];
            if (s.contains(temp)) {
                System.out.println(+temp + "->" + arr[i]);
            }
            s.add(arr[i]);
        }
    }
}