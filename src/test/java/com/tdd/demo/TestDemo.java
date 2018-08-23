package com.tdd.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Test
    public void should_return_a_when_input_a() {
        //given
        String input = "a";
        //when
        List<String> permutation = CreatePermutation.cal(input);
        //then
        assertEquals(Arrays.asList("a"),permutation);
    }

    @Test
    public void should_return_ab_ba_when_input_ab() {
        //given
        String input = "ab";
        //when
        List<String> permutation = CreatePermutation.cal(input);
        //then
        assertEquals(Arrays.asList("ab","ba"),permutation);
    }

}
