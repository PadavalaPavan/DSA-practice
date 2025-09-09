package com.blind75problems;

import java.util.List;
import java.util.ArrayList;

public class FindThePeaks {
    public static void main(String[] args) {
       List<Integer> peaks = findPeaks(new int[]{2,4,4});

    }
    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        for(int i =1;i<mountain.length-1;i++){
            if(mountain[i-1]<mountain[i] && mountain[i]>mountain[i+1]){
                peaks.add(i);
            }
        }
        return peaks;
    }
}
