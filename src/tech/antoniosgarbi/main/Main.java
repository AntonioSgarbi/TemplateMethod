package tech.antoniosgarbi.main;

import tech.antoniosgarbi.Cricket;
import tech.antoniosgarbi.Football;
import tech.antoniosgarbi.Game;

public class Main {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
