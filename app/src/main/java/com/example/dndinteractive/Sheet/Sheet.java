package com.example.dndinteractive.Sheet;

import java.util.ArrayList;
import java.util.List;

public interface Sheet {
    public List<AbilityStat> getAbilityStats();
    public void setAbilityStats(List <AbilityStat> abilityStats);

    public List<Feat> getFeatList();
    public void setFeatList(List<Feat> featList);
    public void getFeatFromList(int index);

    public void addFeatToEnd(Feat feat);
    public void addFeatToFirst(Feat feat);
    public void addFeatAfterIndex(Feat feat, int index);
}
