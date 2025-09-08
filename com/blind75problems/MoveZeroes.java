package com.blind75problems;

public class MoveZeroes {
    public static void main(String[] args) {
//0,1,0,3,12   1,3,12,0,0
        moveZeroes(new int[]{0,1,0,3,1});
    }
    public static void moveZeroes(int[] nums) {
        int index =0;
          for(int i=0;i<nums.length;i++){
              if(nums[i]!=0){
                nums[index++]=nums[i];
              }
          }
          while(index<nums.length){
              nums[index++]=0;
          }
          for(int i :nums)
        System.out.println(i);
    }
}
