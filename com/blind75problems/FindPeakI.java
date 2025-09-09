package com.blind75problems;

public class FindPeakI {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,3,1}));
    }
    public static int findPeakElement(int[] nums) {

        if (nums.length == 1 || nums[0] > nums[1]) return 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i] > nums[i+1]) return i;
        }
        if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
        return 0;
    }
}
