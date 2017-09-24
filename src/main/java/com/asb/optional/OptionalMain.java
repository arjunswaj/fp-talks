package com.asb.optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<Integer> numOptional = Optional.of(5)
                .map(num -> num + 5)
                .map(num -> num * 2)
                .map(num -> num - 2);
        System.out.println(numOptional);
    }
}
