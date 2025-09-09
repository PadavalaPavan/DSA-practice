package com.blind75problems;

public class FindHighestAltitude {
    public static void main(String[] args) {
        System.out.println(    largestAltitude(new int[]{-5,1,5,0,-7}));
    }
    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0,startingAltitude=0;

        for (int j : gain) {
            startingAltitude += j;
            if (startingAltitude > maxAltitude) {
                maxAltitude = startingAltitude;
            }
        }
        return maxAltitude;
    }
}
