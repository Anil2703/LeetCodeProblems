package com.rocky.Arrays;

public class ReverseWordsInString {


    //s = "the sky is blue", return "blue is sky the"
    public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (reversed.length() != 0) {
                    reversed.append(' ');
                }
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("the sky is blue"));
    }
}
