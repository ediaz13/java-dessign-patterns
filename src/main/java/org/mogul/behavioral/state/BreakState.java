package org.mogul.behavioral.state;

public class BreakState extends State {
    public BreakState(Game game) {
        super(game);
        System.out.println("--- Game in Break State ---");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not Allowed!");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Currently on Break");
    }

    @Override
    public void onEndGame() {
        System.out.println("Not Allowed!");;
    }
}
