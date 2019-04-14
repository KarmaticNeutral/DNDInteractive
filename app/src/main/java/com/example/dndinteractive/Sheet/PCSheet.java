package com.example.dndinteractive.Sheet;

import com.example.dndinteractive.Sheet.item.Armor;
import com.example.dndinteractive.Sheet.item.AssortedItem;
import com.example.dndinteractive.Sheet.item.Weapon;

import java.util.ArrayList;
import java.util.List;

public class PCSheet implements Sheet {
    private ArrayList<AbilityStat> abilityStats;
    private ArrayList<Armor> armors;
    private ArrayList<Weapon> weapons;
    private ArrayList<AssortedItem> assortedItems;

    @Override
    public List<AbilityStat> getAbilityStats() {
        return abilityStats;
    }

    @Override
    public void setAbilityStats(List<AbilityStat> abilityStats) {

    }

    @Override
    public List<Feat> getFeatList() {
        return null;
    }

    @Override
    public void setFeatList(List<Feat> featList) {

    }

    @Override
    public void getFeatFromList(int index) {

    }

    @Override
    public void addFeatToEnd(Feat feat) {

    }

    @Override
    public void addFeatToFirst(Feat feat) {

    }

    @Override
    public void addFeatAfterIndex(Feat feat, int index) {

    }
}
