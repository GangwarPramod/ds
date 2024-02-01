package com.javaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateEleementArray {
    public static void main(String[] args)
    {
        int [] arr= new int[]{1,2,2,2,3,2,4,7,7};
        int n=arr.length;
        duplicateElement(arr);
        mapDuplicate(arr);
        mapduplicateFind(arr);
        maxOccurance(arr,n);


    }

    public static void duplicateElement(int[] arr)
    {
       int count =0;
       Set<Integer> visted = new HashSet<>();
        for(int i=0;i<arr.length; i++)
        {
            count=1;
            for(int j=0; j<arr.length; j++){
               if(i==j)
          {
          continue;
             }
                if (arr[i]==arr[j])
                {   count++;


                }

            }
            if (count>1 && !visted.contains(arr[i])){
                visted.add(arr[i]);
                System.out.println(arr[i]);
            }
        }


    }

    public static void mapDuplicate(int[] arr2)
    {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0; i<arr2.length;i ++)
        {
            int v=freq.getOrDefault(arr2[i],0);
            v++;
            freq.put(arr2[i],v);
        }
        for(int j=0;j<arr2.length;j++){
            if(freq.get(arr2[j])>1){
                System.out.println(arr2[j]);
                freq.put(arr2[j],0);

            }
        }

    }
    public static void mapduplicateFind(int [] arr2){
        Map<Integer,Integer> freq1=new HashMap<>();
        for(int i=0; i<arr2.length;i++){
            int v=freq1.getOrDefault(arr2[i],0);
            v++;
            freq1.put(arr2[i],v);
        }
        for(int j=0; j<arr2.length;j++){
            if(freq1.get(arr2[j])>1){
                System.out.println(arr2[j]);
                freq1.put(arr2[j],0);
            }
        }
    }

    public static void maxOccurance(int [] arr,int n) {
        Map<Integer, Integer> freq1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (freq1.containsKey(key)) {
                int v = freq1.get(key);
                v++;
                freq1.put(key, v);
            } else {
                freq1.put(key, 1);
            }

        }
        int maxcount = 0;
        int res = -1;
        for (Map.Entry<Integer, Integer> val : freq1.entrySet()){
            if(maxcount<val.getValue()){
                res=val.getKey();
                maxcount=val.getValue();

            }
        }
      System.out.println(res);
    }
}
