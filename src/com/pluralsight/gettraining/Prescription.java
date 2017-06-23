package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Prescription {

    public int prescriptionId;
    public String role;
    public String medication;
    public String dose;
    public String frequency;
    public Date filledDate;
    public List<Prescription> prescriptionList = new ArrayList<Prescription>();

    Prescription (){

    }

    public void addPrescription(Prescription prescription){
        prescriptionList.add(prescription);
    }

    public Prescription selectPrescription(int prescId){
        int pos= prescriptionList.indexOf(prescId);
        return prescriptionList.get(pos);

    }

    public Prescription updatePrescription(Prescription prescription){
        int pos= prescriptionList.indexOf(prescriptionId);
        Prescription toDelete= prescriptionList.get(pos);
        prescriptionList.remove(toDelete);
        prescriptionList.add(prescription);
        return prescription;

    }

    public void deletePrescription(int prescId){
        int pos= prescriptionList.indexOf(prescId);
        Prescription toDelete= prescriptionList.get(pos);
        prescriptionList.remove(toDelete);

    }

}
