package com.example.dndinteractive;

import com.example.dndinteractive.Sheet.Sheet;
import com.example.dndinteractive.creatureinfo.Location;
import com.example.dndinteractive.creatureinfo.Size;

public class PlayerCharacter implements LivingObject {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Sheet getSheet() {
        return null;
    }

    @Override
    public void setSheet(Sheet sheet) {

    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public void setLocation(Location location) {

    }

    @Override
    public void move(int xChange, int yChange) {

    }

    @Override
    public Size getSize() {
        return null;
    }

    @Override
    public void setSize(Size size) {

    }
}
