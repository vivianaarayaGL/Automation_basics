package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Clinic {
    public int clinicId;
    public String name;
    public String location;
    public String city;
    public String country;
    public String phone;
    public String phone2;

    public List<Clinic> clinicList = new ArrayList<Clinic>();



    Clinic(){
    }



    public void addClinic(Clinic clinic){clinicList.add(clinic);
    }

    public Clinic selectClinic (int clinicId){
        int pos= clinicList.indexOf(clinicId);
        return clinicList.get(pos);

    }

    public Clinic updateClinic (Clinic clinic){
        int pos= clinicList.indexOf(clinicId);
        Clinic toDelete= clinicList.get(pos);
        clinicList.remove(toDelete);
        clinicList.add(clinic);
        return clinic;

    }

    public void deleteClinic (int clinicId){
        int pos= clinicList.indexOf(clinicId);
        Clinic toDelete= clinicList.get(pos);
        clinicList.remove(toDelete);

    }


}