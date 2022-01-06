package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateEleementArray {
    public static void main(String[] args)
    {
        int [] arr= new int[]{1,2,2,3,4,7,7};
        duplicateElement(arr);
        //mapDuplicate(arr);
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

}
