//STEVEN SZACHARA
//SWEN 601
//HOMEWORK 2

package homework;

//NOT SURE WHAT WE ARE USING I AM COMFORTABLE WITH SCANNER
//FOR TAKING IN USER INPUT
import java.util.Scanner;

//THIS IS A CLASS CALLED H2P1 PROBLEM 1 FOR HOMEWORK 2
//CONVERTING A PROMPTED TEMPERATURE IN FARIENHEIGHT TO K

//BEGIN CLASS
public class h2p1 {

    //THIS FUNCTION CONVERTS A TEMP IN F TO K, THEN RETURNS THE DOUBLE
    //FUNCTION DOES NOT CATCH A STRING INPUT, BUT NOT SURE
    //TO INCLUDE THAT, HOMEWORK DID NOT SPECIFY
    public static double convertTEMP(double temp) {
        temp = 5.0/9.0 * (temp - 32.0) + 273.0;
        return temp;
    }
    //EXECUTES THE CONVERSION BY ASKING USER FOR INPUT
    //DECLARES NEW SCANNER TO GET INPUT OF A DOUBLE
    //THEN USES FUNCTION convertTEMP TO CONVERT F TO K
    //THEN SHOWS THE RESULT
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a temp in F:");
        double tempF = reader.nextDouble();
        double newTEMP = convertTEMP(tempF);
        System.out.println(tempF + " degrees Fahrenheit is " + newTEMP + " degress Kelvin");
        reader.close();
    }

}
//END CLASS H2P1
