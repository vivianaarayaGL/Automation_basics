package com.pluralsight.gettraining;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Allergy {

    public int allergyId;
    public String type;
    public Date datereported;
    public Boolean treatment;
    public List<Allergy> allergyList = new ArrayList<Allergy>();

    public void addAllergy(Allergy allergy) {
        allergyList.add(allergy);
    }

    public Allergy() {
    }

    public Allergy selectAllergy (int allergyId) {
        int pos = allergyList.indexOf(allergyId);
        return allergyList.get(pos);
    }

    public Allergy updateAllergy (Allergy allergy) {
        int pos = allergyList.indexOf(allergyId);
        Allergy toDelete = allergyList.get(pos);
        allergyList.remove(toDelete);
        allergyList.add(allergy);
        return allergy;

    }

    public void deleteAllergy (int allergyId) {
        int pos = allergyList.indexOf(allergyId);
        Allergy toDelete = allergyList.get(pos);
        allergyList.remove(toDelete);


    }

}
