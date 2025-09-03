package com.dsa.basicProblems;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        System.out.println( isPalindrome(969));
    }
    public static boolean isPalindrome(int n){
        int reverseNumber = 0;
        int originalNumber =n;

        while(n!=0){
            reverseNumber = reverseNumber*10 + n%10;
            n /= 10;
        }
        return originalNumber == reverseNumber;
    }
}
