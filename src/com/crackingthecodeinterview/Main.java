package com.crackingthecodeinterview;


public class Main {

    public static void main(String[] args) {
        UniqueCharacters uc = new UniqueCharacters();
        String input = "abcdee";
        System.out.println(uc.diffString(input));

        ReverseString rs = new ReverseString();
        String s = "abcde";
        String res = rs.reverse(s.toCharArray());
        System.out.println(res);
    }
}
