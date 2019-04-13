package com.example.dndinteractive;

public interface Creature {
    public void takeDamage(int amount);
    public void heal(int amount);
    public void setHealth(int health);
    public int getHealth();
    public int getAC();
    public int getStr();
    public int getDex();
    public int getCon();
    public int getWis();
    public int getInt();
    public int getCha();

}
