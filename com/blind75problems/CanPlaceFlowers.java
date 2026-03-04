package com.blind75problems;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(  canPlaceFlowers(new int[]{1,0,0,0,1,0,0},2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length-3;i +=2){
            if(flowerbed[i]==0 && flowerbed[i+1]==0){
                n--;
            }else if(flowerbed[i]==1 && flowerbed[i+1]==0 && flowerbed[i+2]==0 && flowerbed[i+3]==0){
                n--;
            }

            if(n==0){
                return true;
            }
        }
        return false;
    }
}
