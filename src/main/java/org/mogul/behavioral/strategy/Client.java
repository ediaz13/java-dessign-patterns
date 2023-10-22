package org.mogul.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        LowerCaseStrategy lowerCaseStrategy = new LowerCaseStrategy();
        UpperCaseStrategy upperCaseStrategy = new UpperCaseStrategy();
        RandomStrategy randomStrategy = new RandomStrategy();

        String input = "The thing here is test the startegy design pattern!";

        Executor executor = new Executor(randomStrategy);
        executor.printString(input);

    }
}
