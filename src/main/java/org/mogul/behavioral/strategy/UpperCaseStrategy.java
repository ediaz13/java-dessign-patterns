package org.mogul.behavioral.strategy;

public class UpperCaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        return input.toUpperCase();
    }
}
