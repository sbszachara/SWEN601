//STEVEN SZACHARA
//SWEN 601
//HOMEWORK 2
//THIS EXCERSISE IS ABOUT MAKING A FUNCTION TO CONCAT
//VARIABLES INTO A STRING FROM A USER

package homework;

//NOT SURE WHAT WE ARE USING I AM COMFORTABLE WITH SCANNER
//FOR TAKING IN USER INPUT
import java.util.Scanner;

public class concatWhiskers {

    //THIS FUNCTION WILL TAKE IN A STRING AND
    //TWO OTHER PARAMETERS, A DOUBLE AND BOOLEAN
    //AND RETURN A CONCATENATED STRING

    public static String bigCatFunc(String a, double b, boolean c) {
        //THIS IS RETURNING A STRING OF ALL THE ABOVE CONCATTED
        return a + " " + b + " " + c;

    }

    //START MAIN
    public static void main(String args[]) {

        //NEW SCANNER TO GET THE INPUT FROM THE USER
        Scanner reader = new Scanner(System.in);

        //PROMPT FOR USER
        System.out.println("Please type in a word:");
        //GRABS STRING FROM USER
        String name = reader.next();

        //PROMPTS AND STORES DOUBLE FROM USER
        System.out.println("Please type in a number:");
        Double numberman = reader.nextDouble();

        //PROMPTS AND STORES BOOLEAN FROM USER
        System.out.println("True or False? Type it:");
        Boolean bigboo = reader.nextBoolean();

        //CALLS OUR bigCatFunc FUNCTION TO COME IN AND CONCAT IT ALL
        //INTO A STRING AND RETURN A STRING INTO STRING bigKitty
        String bigKitty = bigCatFunc(name, numberman, bigboo);

        //PRINTS OUT WHAT YOU CONCATTED
        System.out.println("Look at what you made!");
        System.out.println(bigKitty);

        //CLOSE THE READER
        reader.close();

    }
    //END MAIN


}
//END CONCATWHISKERS
