package com.blind75problems;

import java.util.Arrays;

public class MaxNumberOfKPairs {
    public static void main(String[] args) {
        System.out.println( maxOperations(new int[]{3,1,3,4,3},6));
    }
    public static int maxOperations(int[] nums, int k) {
       // sorting(nums);
        Arrays.sort(nums);
       int left=0,right= nums.length-1,count=0;
       while(left<right){
           int sum = nums[left]+nums[right];
           if(sum==k){
               count++;
               right--;
               left++;
           }
           else if(sum<k){
               left++;
           }else{
               right--;
           }
       }
        return count;
    }

    public static void sorting(int[] nums){

        for(int i=0;i<nums.length-1;i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
