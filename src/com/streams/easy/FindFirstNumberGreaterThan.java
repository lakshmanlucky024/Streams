package com.streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 20,30,35,12,45,50);
        Optional<Integer> first = numbers.stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst();
        System.out.println(first);
    }
}
