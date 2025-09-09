package com.blind75problems;

public class IsSequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa","bbaaaa"));
        System.out.println(usingTwoPointers("aaaaaa","bbaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {
        int position = -1;

        for(int i =0;i<s.length();i++){
            position = t.indexOf(s.charAt(i),position+1);
            if(position==-1){
                return false;
            }
        }
        return true;
    }

    public static boolean usingTwoPointers(String s, String t){
        int i =0 ,j =0;

        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}
