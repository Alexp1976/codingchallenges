package com.challenges.solution.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomize {

    public static List<Integer> randomizeIntegers(int origin, int bound, int quantity) {

        List<Integer> response = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            response.add(new Random().nextInt(origin, bound));
        }

        return response;
    }
}
