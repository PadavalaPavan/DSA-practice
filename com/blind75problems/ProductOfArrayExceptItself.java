package com.blind75problems;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {

        int[] product = productExceptSelf(new int[]{1,2,3,4});
    }
    public static  int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int value =1;
        for(int i=0;i<nums.length;i++){

            product[i] = value;
            value = value*nums[i];
        }
        int value1 =1;
        for(int i=nums.length-1;i>=0;i--){
            product[i] = value1*product[i];
            value1 = value1*nums[i];
        }
        return product;
    }
}
