package com.blind75problems;

import java.util.*;

public class UniqueNumberOccurrence {
    public static void main(String[] args) {
boolean flag = uniqueOccurrences(new int[]{1,2,2,1,1,3});
        System.out.println(flag);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int count =1;
        for (int j : arr) {
            if (set.containsKey(j)) {
                set.put(j, set.get(j) + 1);
            } else {
                set.put(j, count);
            }

        }

        Set<Integer> map = new HashSet<>();

        for(int i : set.values()){
            if(map.contains(i)){
                return false;
            }
            map.add(i);
        }
        return true;
    }
}
