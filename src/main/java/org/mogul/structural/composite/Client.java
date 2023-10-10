package org.mogul.structural.composite;

public class Client {
    public static void main(String[] args) {
        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("Processor", 1250);
        Equipment hdd = new Equipment("Hard Drive", 250);
        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("Read Only Memory", 750);
        Equipment ram = new Equipment("Random Access Memory", 120);

        memory.add(rom).add(ram);

        computer.add(processor).add(hdd).add(memory);

        System.out.println("PC price: " + computer.getPrice());

    }

}
