package com.example.dndinteractive;

import com.example.dndinteractive.Sheet.Sheet;
import com.example.dndinteractive.creatureinfo.Location;
import com.example.dndinteractive.creatureinfo.Size;

public class PlayerCharacter implements LivingObject {
    private String name;
    private Sheet sheet;
    private Location location;

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
        return sheet;
    }

    @Override
    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
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
