
package com.pluralsight.gettraining;

import java.util.Arrays;
import java.io.Console;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by vivianaaraya on 6/26/17.
 */
public class testConsole extends Patient{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Patient: ");
        String Patient1 = br.readLine();
        String Patient2= br.readLine();
        String Patient3 = br.readLine();
        System.out.println(Patient1);
        System.out.println(Patient2);
        System.out.println(Patient3);
        String myStrings[];
        myStrings = new String[] {Patient1, Patient2, Patient3 };

    }


    }
