package com.blind75problems;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public static int pivotIndex(int[] nums) {

        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        //[1,7,3,6,5,6]
        //sumright =  [27,20,17,11,6,0]
        //sumleft = [0,1,8,11,17,23]
        int leftSum = 0;
        int rightSum = 0;
        sumRight[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum += nums[i + 1];
            sumRight[i] = rightSum;
        }

        sumLeft[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            sumLeft[i] = leftSum;
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }
}
