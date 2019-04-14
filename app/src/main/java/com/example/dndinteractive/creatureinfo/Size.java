package com.example.dndinteractive.creatureinfo;

public class Size {
    private int xDimension;
    private int yDimension;

    public Size(int xDimension, int yDimension) {
        this.xDimension = xDimension;
        this.yDimension = yDimension;
    }

    public int getxDimension() {
        return xDimension;
    }

    public void setxDimension(int xDimension) {
        this.xDimension = xDimension;
    }

    public int getyDimension() {
        return  yDimension;
    }

    public void setyDimension(int yDimension) {
        this.yDimension = yDimension;
    }
}
