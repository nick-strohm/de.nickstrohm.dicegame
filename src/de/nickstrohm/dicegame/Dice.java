package de.nickstrohm.dicegame;

import java.util.Random;

public class Dice {
    private int sides;
    private Random rng;

    public Dice(int sides) {
        setSides(sides);
        setRng(new Random());
    }

    public int getSides() {
        return sides;
    }

    private void setSides(int sides) {
        this.sides = sides;
    }

    public Random getRng() {
        return rng;
    }

    private void setRng(Random rng) {
        this.rng = rng;
    }

    public int roll() {
        return rng.nextInt(sides) + 1;
    }
}
