package com.example.dndinteractive;

import com.example.dndinteractive.Sheet.Sheet;
import com.example.dndinteractive.creatureinfo.Location;
import com.example.dndinteractive.creatureinfo.Size;

public interface LivingObject {
    public String getName();
    public void setName(String name);

    public Sheet getSheet();
    public void setSheet(Sheet sheet);

    public Location getLocation();
    public void setLocation(Location location);
    public void move(int xChange, int yChange);

    public Size getSize();
    public void setSize(Size size);
}
