//Steven Szachara
//HW3 SWEN 601
package homework;
import java.util.Scanner;

public class displaydateHW {

    //switch statements
    //correct suffix
    //takes input from user in YYYY/MM/DD
    //returns Month Day, Year
    //String input, string output

    //function that returns the disired final date format as a string
    public static String theNewDate (String y, String m, String d) {
        
        //suffix defined for days
        String suffix = "";

        //the change to the word for the month corresponding to the number
        String monthy = "";

        //switch statement for the day
        switch (d) {
            case "01":
                suffix = "st";
                break;
            case "02":
                suffix = "nd";
                break;
            case "03":
                suffix = "rd";
                break;
            case "21":
                suffix = "st";
                break;
            case "22":
                suffix = "nd";
                break;
            case "23":
                suffix = "rd";
                break;
            case "31":
                suffix = "st";
                break;
            default:
                suffix = "th";
                break;
        }

        //switch statement for the month
        switch (m) {
            case "01":
                monthy = "January";
                break;
            case "02":
                monthy = "February";
                break;
            case "03":
                monthy = "March";
                break;
            case "04":
                monthy = "April";
                break;
            case "05":
                monthy = "May";
                break;
            case "06":
                monthy = "June";
                break;
            case "07":
                monthy = "July";
                break;
            case "08":
                monthy = "August";
                break;
            case "09":
                monthy = "September";
                break;
            case "10":
                monthy = "October";
                break;
            case "11":
                monthy = "November";
                break;
            case "12":
                monthy = "December";
                break;
            default:
                monthy = "Invalid Month";
                break;
        }

        //cleans up the day if there are 0's in front of it
        d = d.replace('0', ' ');
        d = d.stripLeading();

        //returns the desired statement as a string
        return monthy + " " + d + suffix + ", " + y;
    }
    public static void main(String args[]) {
        //new scanner set up
        Scanner reader = new Scanner(System.in);
        //user prompt
        System.out.println("Enter the date:");
        //gets string format
        String date = reader.next();

        //sets up year, month, and day based on correct format
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8,10);

        //prints out the adjusted date in the correct format
        System.out.println(theNewDate(year,month,day));
        reader.close();
    }
    //end main

    
}
//end class
