package com.blind75problems;

public class MergeStringAlternately {
    public static void main(String[] args) {
       String word1 = "abcd", word2 = "pq";
       MergeStringAlternately msa = new MergeStringAlternately();
        System.out.println(msa.mergeAlternately(word1,word2));
        System.out.println(mergeAlternately2(word1,word2));
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();

        if(word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                mergedString.append(word1.charAt(i)).append(word2.charAt(i));
            }
        } else
        if(word1.length()>word2.length()){
            for (int i =0;i<word2.length();i++){
                mergedString.append(word1.charAt(i)).append(word2.charAt(i));
            }
            mergedString.append(word1, word2.length(), word1.length());
        }  else{
            for (int i =0;i<word1.length();i++){
                mergedString.append(word1.charAt(i)).append(word2.charAt(i));
            }
            mergedString.append(word2, word1.length(), word2.length());
        }

        return mergedString.toString();
    }
    public static String mergeAlternately2(String word1, String word2){
        int length1 = word1.length();
        int length2 = word2.length();
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<length1 || i<length2){
            if(i<length1){
                sb.append(word1.charAt(i));
            }
            if(i<length2){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
