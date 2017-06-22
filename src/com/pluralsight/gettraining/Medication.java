package com.pluralsight.gettraining;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Medication {

    public String type;
    public String name;
    public String treatment;
    public String dosage;
    public String contraindications;

    Medication(String type, String name, String treatment, String dosage, String contraindications){

        this.type = type;
        this.name = name;
        this.treatment = treatment;
        this.dosage = dosage;
        this.contraindications = contraindications;
    }

}
