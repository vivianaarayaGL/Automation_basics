package com.pluralsight.gettraining;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Hospital {

    public String name;
    public String location;
    public String city;
    public String country;
    public String phone;

    Hospital(String name, String location, String city,String country, String phone){

        this.name = name;
        this.location = name;
        this.city = city;
        this.country = country;
        this.phone = phone;
    }


    Patient pat = new Patient();

    public void add(){
        // Llenar un paciente nuevo con las propiedades
        Patient patient = new Patient();
        patient.name = "Vivi";


        pat.addPatient(patient);
    }


}
