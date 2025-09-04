package com.blind75problems;


import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
       List<Boolean> flag = kidsWithCandies(new int[]{2,3,5,1,3},3);
        System.out.println(flag);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> flag = new ArrayList<>();
      int max = highestCandies(candies);
      for(int i=0;i<candies.length;i++) {
          if (candies[i]+extraCandies>=max){
              flag.add(true);
          }else{
              flag.add(false);
          }
      }

      return flag;
    }
    public static int highestCandies(int[] candies){
        int max =candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        return max;
    }
}
