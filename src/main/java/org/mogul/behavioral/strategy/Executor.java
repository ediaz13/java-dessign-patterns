package org.mogul.behavioral.strategy;

public class Executor {
    public PrintStrategy printStrategy;

    public Executor(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void printString(String input) {
        System.out.println(printStrategy.formatString(input));
    }
}
