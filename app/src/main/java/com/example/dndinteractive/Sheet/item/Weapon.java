package com.example.dndinteractive.Sheet.item;

import com.example.dndinteractive.Sheet.Ability;

import java.util.List;

public class Weapon implements Item {
    private String name;
    private String description;
    private float weight;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public float getWeight() {
        return 0;
    }

    @Override
    public void setWeight(float weight) {

    }
}
