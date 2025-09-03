package com.dsa.basicProblems;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(  reverseNumber(39));
    }
    public static int reverseNumber(int n){
        int reverseNumber =0;

        while(n>0){
            reverseNumber = reverseNumber*10 + n%10;
           n = n/10;
        }
        return reverseNumber;
    }
}
