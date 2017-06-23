package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Medication {

    public int medicationId;
    public String type;
    public String name;
    public String treatment;
    public String dosage;
    public String contraIndications;
    public List<Medication> medicationList = new ArrayList<Medication>();

    Medication(){

    }

    public void addMedication(Medication medication){
        medicationList.add(medication);
    }

    public Medication selectMedication(int medId){
        int pos= medicationList.indexOf(medId);
        return medicationList.get(pos);

    }

    public Medication updateMedication(Medication medication){
        int pos= medicationList.indexOf(medicationId);
        Medication toDelete= medicationList.get(pos);
        medicationList.remove(toDelete);
        medicationList.add(medication);
        return medication;

    }

    public void deleteMedication(int medId){
        int pos= medicationList.indexOf(medId);
        Medication toDelete= medicationList.get(pos);
        medicationList.remove(toDelete);

    }


}
