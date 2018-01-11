package de.nickstrohm.dicegame;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.add(20));
        System.out.println(game.addIterativ(20));
        System.out.println(game.max(20));
        System.out.println(game.maxIterativ(20));
        System.out.println(game.result(20));
        System.out.println(game.resultIterativ(20));
    }
}
