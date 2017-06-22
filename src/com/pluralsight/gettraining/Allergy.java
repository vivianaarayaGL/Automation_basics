package com.pluralsight.gettraining;

import java.util.Date;

/**
 * Created by vivianaaraya on 6/21/17.
 */
public class Allergy {

    public String type;
    public Date datereported;
    public Boolean treatment;


    Allergy(String type, Date datereported, Boolean treatment){

        this.type = type;
        this.datereported = datereported;
        this.treatment = treatment;


    }

}
