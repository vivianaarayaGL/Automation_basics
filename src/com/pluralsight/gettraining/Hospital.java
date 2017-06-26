package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Hospital {

    public int hospitalId;
    public String name;
    public String location;
    public String city;
    public String country;
    public String phone;
    public List<Hospital> hospitalList = new ArrayList<Hospital>();



    Hospital(){
    }



    public void addHospital(Hospital hospital){hospitalList.add(hospital);
    }

    public Hospital selectHospital(int hospId){
        int pos= hospitalList.indexOf(hospId);
        return hospitalList.get(pos);

    }

    public Hospital updateHospital(Hospital hospital){
        int pos= hospitalList.indexOf(hospitalId);
        Hospital toDelete= hospitalList.get(pos);
        hospitalList.remove(toDelete);
        hospitalList.add(hospital);
        return hospital;

    }

    public void deleteHospital(int hospId){
        int pos= hospitalList.indexOf(hospId);
        Hospital toDelete= hospitalList.get(pos);
        hospitalList.remove(toDelete);

    }


}
