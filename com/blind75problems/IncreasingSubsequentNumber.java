package com.blind75problems;

public class IncreasingSubsequentNumber {
    public static void main(String[] args) {
        System.out.println(  increasingTriplet(new int[]{0,4,2,1,0,-1,-3}));
    }
    public static boolean increasingTriplet(int[] nums) {
        int count = 1;

        int first = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (first < nums[i]) {
                count++;
                first = nums[i];
            }
            if (first > nums[i]) {
                first = nums[i];
                count = 1;
            }
            if (count == 3) {
                return true;
            }
        }

        return false;
    }
}
