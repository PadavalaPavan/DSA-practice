package com.blind75problems;

public class GCDOfString {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
    }
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str2+str1).equals(str1+str2)){
             return "";
        }

        int gcdLength = gcd(str1.length(),str2.length());
        String gcd = str1.substring(0,gcdLength);
    return gcd;
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
