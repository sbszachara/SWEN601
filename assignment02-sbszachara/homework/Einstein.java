//STEVEN SZACHARA
//SWEN 601
//HOMEWORK 2
//THIS HOMEWORK QUESTION IS SEEING IF WE CAN CREATE
//FUNCTIONS THAT CAN DO REAL WORLD EQUATIONS

package homework;

//NOT SURE WHAT WE ARE USING I AM COMFORTABLE WITH SCANNER
//FOR TAKING IN USER INPUT

import java.util.Scanner;

public class Einstein {

    //THIS FUNCTION TAKES IN GRAMS
    //CONVERTS TO KG, FOR THE MASS PART OF E = MC^2 TO WORK
    //THEN SQUARES SPEED OF LIGHT IN A VACUUM IN METERS PER SEC
    //AS double c
    //THEN DOES THE E = MC^2 EQUATION
    //AND RETURNS THE E AS e

    public static double gramsnJoules(double g) {
        double kg = g/1000;
        double c = 299792458.0;
        double e = kg * (c*c);
        return e;
    }

    //START MAIN
    public static void main(String[] args) {

        //NEW SCANNER TO GET THE INPUT FROM THE USER
        Scanner reader = new Scanner(System.in);

        //TEXT TO TELL THE USER WHAT INPUT IT WANTS
        System.out.println("Please enter the grams for the E=mc^2 equation:");

        //DOUBLE VARIABLE TO GET THE INPUT AS A DOUBLE FROM USER
        double userGRAMS = reader.nextDouble();

        //CALLING THE FUNCTION ABOVE TO CONVER
        double joules = gramsnJoules(userGRAMS);

        //PRINT RESULTS
        System.out.println("The Joules energy is: " + joules + " Joules");

        //CLOSE READER
        reader.close();


    } 
    //END MAIN

}
//END CLASS EINSTEIN

