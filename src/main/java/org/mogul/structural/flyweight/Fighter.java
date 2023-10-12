package org.mogul.structural.flyweight;

public class Fighter implements Sprite {
    private FighterRank rank;

    public Fighter(FighterRank rank) {
        this.rank = rank;
    }

    public FighterRank getRank() {
        return rank;
    }
    @Override
    public void draw() {
        System.out.println("Drawing the fighter.");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving the fighter to position: " + "x: " + x + " y:" +y);
        System.out.println(String.format("Moving the fighter to position: x= %d, y=%d", x, y));
    }
}
