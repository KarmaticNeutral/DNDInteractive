package com.example.dndinteractive.creatureinfo;

public class Location {
    private int xPos;
    private int yPos;

    public Location(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void addXPos(int xChange) {
        xPos += xChange;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos() {
        this.yPos = yPos;
    }

    public void addYPos(int yChange) {
        yPos += yChange;
    }
}
