package com.streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> reduce = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println(reduce);


    }
}
