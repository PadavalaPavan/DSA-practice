package com.blind75problems;


import java.util.Arrays;

public class ReverseTheVowels {
    public static void main(String[] args) {
        String s = "Ice CreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s){
        char[] c = s.toCharArray();
        int left =0,right=s.length()-1;
        while(left<right){
            while(left<right && !isVowel(c[left])){
                left++;
            }
            while(left<right && !isVowel(c[right])){
                right--;
            }
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            right--;
            left++;
        }
        return new String(c);
    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
