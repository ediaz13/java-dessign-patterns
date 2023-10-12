package org.mogul.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FighterFactory {
    static Map<FighterRank, Fighter> fighters = new HashMap<>();

    public static Fighter getFighter(FighterRank fighterRank) {
        Fighter f = fighters.get(fighterRank);

        if (f == null) {
            f = new Fighter(fighterRank);
            fighters.put(fighterRank, f);
        }

        return f;

    }
}
