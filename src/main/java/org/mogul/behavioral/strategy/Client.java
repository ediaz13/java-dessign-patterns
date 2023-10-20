package org.mogul.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        LowerCaseStrategy lowerCaseStrategy = new LowerCaseStrategy();
        UpperCaseStrategy upperCaseStrategy = new UpperCaseStrategy();
        RandomStrategy randomStrategy = new RandomStrategy();

        String input = "La onda es probar esto Dude!";

        Executor executor = new Executor(randomStrategy);
        executor.printString(input);

    }
}
