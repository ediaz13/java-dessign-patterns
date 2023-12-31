package org.mogul.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Army {
    private List<Fighter> army = new ArrayList<>();

    public void spawnFighter (FighterRank fighterRank) {
        Fighter f = new Fighter(fighterRank);
        army.add(f);
    }

    public void drawArmy() {
        for (Fighter fighter: army) {
            switch (fighter.getRank()) {
                case PRIVATE: System.out.println("P ");
                    break;
                case SARGENT: System.out.println("S ");
                    break;
                default:
                    System.out.println("M ");
            }

            fighter.move(ThreadLocalRandom.current().nextInt(0, 1000), 3);
        }
    }
}
