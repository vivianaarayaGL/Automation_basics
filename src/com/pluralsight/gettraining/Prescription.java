package com.pluralsight.gettraining;

import java.util.Date;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Prescription {

    public String role;
    public String medication;
    public String dose;
    public String frequency;
    public Date filledDate;

    Prescription (String role, String medication, String dose, String frequency, Date filledDate){

        this.role = role;
        this.medication = medication;
        this.dose = dose;
        this.frequency = frequency;
        this.filledDate = filledDate;
    }
}
