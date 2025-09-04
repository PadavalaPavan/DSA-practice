package com.blind75problems;

public class ReverseWordsInString {
    public static void main(String[] args) {
       String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i =ss.length-1;i>=0;i--){
            System.out.println(ss[i].length());
            if(!ss[i].isEmpty()) {
                sb.append(ss[i].trim()).append(" ");
            }
        }
     return sb.toString();
    }
}
