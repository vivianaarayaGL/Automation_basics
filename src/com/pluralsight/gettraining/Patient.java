package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {

    public int patientId; //pk
    public String name;
    public String lastname;
    public Date birthdate;
    public String phone;
    public String city;
    public String email;
    public List<Patient> patientList = new ArrayList<Patient>();

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public Patient() {
    }

    public Patient selectPatient(int patientId) {
        int pos = patientList.indexOf(patientId);
        return patientList.get(pos);
    }

    public Patient updatePatient(Patient patient) {
        int pos = patientList.indexOf(patientId);
        Patient toDelete = patientList.get(pos);
        patientList.remove(toDelete);
        patientList.add(patient);
        return patient;

    }

    public void deletePatient(int patientId) {
        int pos = patientList.indexOf(patientId);
        Patient toDelete = patientList.get(pos);
        patientList.remove(toDelete);


    }

}

