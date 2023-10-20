package org.mogul.behavioral.strategy;

import java.util.Random;

public class RandomStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        String output = "";
        Random random = new Random();

        for (Character ch : input.toCharArray()) {
            if (random.nextBoolean()) {
                output += ch.toString().toLowerCase();
            } else {
                output += ch.toString().toUpperCase();
            }
        }

        return output;
    }
}
