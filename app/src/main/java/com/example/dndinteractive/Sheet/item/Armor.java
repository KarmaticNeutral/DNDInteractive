package com.example.dndinteractive.Sheet.item;

public class Armor implements Item {
    private String name;
    private String description;
    private float weight;
    private int ACBonus;
    private int dexBonusMax;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getACBonus() {
        return ACBonus;
    }

    public void setACBonus(int ACBonus) {
        this.ACBonus = ACBonus;
    }

    public int getDexBonusMax() {
        return dexBonusMax;
    }

    public void setDexBonusMax(int dexBonusMax) {
        this.dexBonusMax = dexBonusMax;
    }
}
