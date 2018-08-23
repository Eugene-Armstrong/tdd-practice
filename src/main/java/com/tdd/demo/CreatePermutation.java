package com.tdd.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatePermutation {
    public static List<String> cal(String input) {
        if (input.length() == 2) {
            String tmp = input.substring(1) + input.substring(0, 1);
            return Arrays.asList(input, tmp);
        }
        if (input.length() == 3) {
            List<String> permutations = new ArrayList<>();
            permutations.add(input);
            permutations.add(input.substring(0, 1) + input.substring(2) + input.substring(1, 2));
            permutations.add(input.substring(1, 2) + input.substring(0, 1) + input.substring(2));
            permutations.add(input.substring(1, 2) + input.substring(2) + input.substring(0, 1));
            permutations.add(input.substring(2) + input.substring(0, 1) + input.substring(1, 2));
            permutations.add(input.substring(2) + input.substring(1, 2) + input.substring(0, 1));
            return permutations;
        }
        return Arrays.asList(input);
    }
}
