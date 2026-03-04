package com.blind75problems;

import java.util.List;
import java.util.Stack;

public class RemovingStarFromString {
    public static void main(String[] args) {
   String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) !='*')
                sb.append( s.charAt(i));

        }
        return sb.toString();
    }
}
