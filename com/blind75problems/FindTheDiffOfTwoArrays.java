package com.blind75problems;

import java.io.FilterOutputStream;
import java.util.*;

public class FindTheDiffOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,5}));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n: nums1) set1.add(n);
        for(int n: nums2) set2.add(n);

        List<Integer> list1 = new ArrayList<>(set1);
        list1.removeAll(set2);
        List<Integer> list2 = new ArrayList<>(set2);
        list2.removeAll(set1);

        list.add(list1);list.add(list2);

        return list;
    }
}
