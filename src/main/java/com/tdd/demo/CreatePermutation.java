package com.tdd.demo;

import java.util.Arrays;
import java.util.List;

public class CreatePermutation {
    public static List<String> cal(String input) {
        if(input.length() == 2){
            String tmp = input.substring(1) + input.substring(0,1);
            return Arrays.asList(input,tmp);
        }
        return Arrays.asList(input);
    }
}
