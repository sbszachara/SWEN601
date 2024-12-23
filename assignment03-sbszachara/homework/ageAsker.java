//Steven Szachara
//HW3 SWEN 601
package homework;
import java.util.Scanner;

//this class will ask the user their age
//then based on that, will display a response
public class ageAsker {
    public static void main(String args[]){
        
        //gets the input reader set up
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = reader.nextInt();

        //if statement that looks at the age and determines what category
        //then prints out the age category
        if (age >= 0 && age <= 10) {
            System.out.println("Is this your first program?");
        }
        else if (age > 10 && age < 14) {
            System.out.println("A tween!");
        }
        else if (age >= 14 && age < 20) {
            System.out.println("A teen!");
        }
        else if (age >=20 && age < 30) {
            System.out.println("A twenty-something!");
        }
        else {
            System.out.println("With age comes experience.");
        }
        reader.close();
    }
    //end of main
}
//end of ageAsker class
