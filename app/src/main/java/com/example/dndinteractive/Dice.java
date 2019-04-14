package com.example.dndinteractive;

public class Dice {
    private int numDice;
    private int numSides;

    public Dice(int numDice, int numSides) {
        this.numDice = numDice;
        this.numSides = numSides;
    }


    public int getNumDice() {
        return numDice;
    }

    public void setNumDice(int numDice) {
        this.numDice = numDice;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
}
