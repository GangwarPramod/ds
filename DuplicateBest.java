package com;

import java.util.HashMap;
import java.util.Map;

public class DuplicateBest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[]{1, 1, 2, 4, 5, 6, 7, 7};
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            int v=freq.getOrDefault(arr[i], 0);
            v++;
        freq.put(arr[i],v);
        }
        for(int i=0; i<arr.length; i++){
        if(freq.get(arr[i])==1){
            System.out.println(arr[i]);
        }
    }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
}}
