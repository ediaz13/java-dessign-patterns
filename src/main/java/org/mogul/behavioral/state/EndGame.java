package org.mogul.behavioral.state;

public class EndGame extends State {
    public EndGame(Game game) {
        super(game);
        System.out.println("--- Game in End Game State ---");
    }

    @Override
    public void onWelcomeScreen() {
        game.changeState(new WelcomeScreenState(game));
    }

    @Override
    public void onPlaying() {
        System.out.println("Not Allowed!");
    }

    @Override
    public void onBreak() {
        System.out.println("Not Allowed!");
    }

    @Override
    public void onEndGame() {
        System.out.println("Currently EndGameState!");
    }
}
