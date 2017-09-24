package com.asb.optional;

import java.util.Optional;

public class OptionalMain {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Optional<Integer> num1 = Optional.of(5);
        Optional<Integer> num2 = Optional.of(6);

        Optional<Integer> result = num1.flatMap(a -> num2.map(b -> a + b));
        System.out.println(result);
    }
}
