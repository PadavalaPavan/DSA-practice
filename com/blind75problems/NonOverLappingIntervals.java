package com.blind75problems;

import java.util.StringJoiner;

public class NonOverLappingIntervals {
    public static void main(String[] args) {
        eraseOverlapIntervals(new int[][]{{1,100},{11,22},{1,11},{2,12}});
        StringJoiner sj = new StringJoiner(",","[","]");
    }
    public static int eraseOverlapIntervals(int[][] intervals) {

        for(int i =0;i<intervals.length-1;i++){
            if(sorting(intervals[i],intervals[i+1])){
                int[] temp = intervals[i];
                intervals[i] = intervals[i+1];
                intervals[i+1] = temp;
            }
        }
        int count =0;
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1] > intervals[i+1][0]){
                count++;

            }
        }
        return count;
    }

    public static boolean sorting(int[] a, int[] b){
        if(a[0]>b[0]) return true;
        else if (a[0]==b[0] && a[1] > b[1]) return true;
        else return false;
    }
}
