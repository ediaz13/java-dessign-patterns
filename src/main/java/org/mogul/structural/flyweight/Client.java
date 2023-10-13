package org.mogul.structural.flyweight;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        int draw = 1000;
        Army army = new Army();
        FighterRank currentRank;
        Random random = new Random();

        for (int i = 0; i < draw; i++) {
            switch (random.nextInt(3)) {
                case 0: currentRank = FighterRank.PRIVATE;
                    break;
                case 1: currentRank = FighterRank.SARGENT;
                    break;
                default: currentRank = FighterRank.MAJOR;
                    break;
            }

            army.spawnFighter(currentRank);
        }

        army.drawArmy();
    }
}
