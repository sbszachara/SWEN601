//Steven Szachara
//HW3 SWEN 601
package homework;
import java.util.Scanner;

//using if statements, prompts user for music or movies discussion
public class moviesOrMusic {
    public static void main(String args[]){
        
        //gets the input reader set up
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 1 to discuss music or 2 to discuss movies");
        int choice = reader.nextInt();

        //big if statement determines what they want to discuss, music or movies
        //this prompts music
        if (choice == 1) {
            System.out.println("What is your favorite band?");
            //this takes the whole line if there are spaces too
            String bandChoice = reader.next() + reader.nextLine();
            if (bandChoice.equals("My Chemical Romance")) {
                System.out.println("Good taste!");
            }
            else {
                System.out.println("There is no accounting for taste!");
            }
        }
        //this prompts movies
        else if (choice == 2) {
            System.out.println("Which Star Wars Episode was the best? Choose 1-9");
            int starChoice = reader.nextInt();
            //this inner if statement determines a response based on what
            //star wars movie the user inputs
            if (starChoice == 4 || starChoice == 5) {
                System.out.println("I agree!");
            }
            else if (starChoice >= 1 && starChoice <= 3) {
                System.out.println("Um, no");
            }
            else if (starChoice >= 6 || starChoice <= 9) {
                System.out.println("I like those, too!");
            }
            else {
                System.out.println("Not a choice.");
            }
        }
        //this says no if it isn't 1 or 2
        else {
            System.out.println("NOT A VALID CHOICE.");
        }

        reader.close();
    }
    //end main
}
//end class
