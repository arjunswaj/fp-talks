package com.asb.optional;

import java.util.Optional;

public class OptionalMain {

    public static Optional<Double> sqrt(int num) {
        if (num < 0) {
            return Optional.empty();
        } else {
            return Optional.of(Math.sqrt(num));
        }
    }

    public static void main(String[] args) {
        Optional<Integer> numOptional = Optional.of(5);
    }
}
