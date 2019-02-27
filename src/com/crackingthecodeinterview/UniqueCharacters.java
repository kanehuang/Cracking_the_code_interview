package com.crackingthecodeinterview;

import java.util.Arrays;

public class UniqueCharacters {
    public boolean diffString(String input) {
        char[] c_input = input.toCharArray();
        Arrays.sort(c_input);

        for(int i = 1; i < c_input.length; i++) {
            if(c_input[i] == c_input[i-1]) {
                return false;
            }
        }
        return true;
    }
}
