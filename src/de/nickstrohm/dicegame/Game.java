package de.nickstrohm.dicegame;

public class Game {
    private Dice dice;

    public Game() {
        setDice(new Dice(20));
    }

    public Dice getDice() {
        return dice;
    }

    private void setDice(Dice dice) {
        this.dice = dice;
    }

    public int add(int x) {
        if (x == 0) {
            return 0;
        }

        return getDice().roll() + add(x - 1);
    }

    public int addIterativ(int x) {
        if (x == 0) {
            return 0;
        }

        int value = 0;
        for (int i = 0; i < x; i++) {
            value += getDice().roll();
        }

        return value;
    }

    public int max(int x) {
        return max(x, 0);
    }

    public int max(int x, int max) {
        if (x == 0) {
            return max;
        }

        int current = getDice().roll();
        if (current > max) {
            max = current;
        }

        return max(x - 1, max);
    }

    public int maxIterativ(int x) {
        if (x == 0) {
            return 0;
        }

        int max = 0;
        for (int i = 0; i < x; i++) {
            int current = getDice().roll();
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public String result(int x) {
        if (x == 0) {
            return "";
        }

        if (x == 1) {
            return "" + getDice().roll();
        }

        String current = getDice().roll() + "-";
        return current + result(x - 1);
    }

    public String resultIterativ(int x) {
        if (x == 0) {
            return "";
        }

        String current = "" + getDice().roll();

        for (int i = 1; i < x; i ++) {
            current += "-" + getDice().roll();
        }

        return current;
    }
}
