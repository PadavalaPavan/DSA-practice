package com.dsa.practice;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println( usingFormula(5));
        System.out.println(usingLoop(5));
    }
    public static int usingFormula(int n){
        int sum =0;
        sum = n*(n+1)/2;
        return sum;
    }
    public static int usingLoop(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        return sum;
    }
}
