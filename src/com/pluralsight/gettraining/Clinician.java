package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Clinician {

    public int clinicianId;
    public String name;
    public String lastname;
    public String role;
    public Boolean clinic;
    public String speciality;
    public Boolean active;
    public List<Clinician> clinicianList = new ArrayList<Clinician>();

    public void addClinician(Clinician clinician) {
        clinicianList.add(clinician);
    }

    public Clinician() {
    }

    public Clinician selectClinician(int clinicianId) {
        int pos = clinicianList.indexOf(clinicianId);
        return clinicianList.get(pos);
    }

    public Clinician updateClinician(Clinician clinician) {
        int pos = clinicianList.indexOf(clinicianId);
        Clinician toDelete = clinicianList.get(pos);
        clinicianList.remove(toDelete);
        clinicianList.add(clinician);
        return clinician;

    }

    public void deleteClinician(int clinicianId) {
        int pos = clinicianList.indexOf(clinicianId);
        Clinician toDelete = clinicianList.get(pos);
        clinicianList.remove(toDelete);


    }

}
