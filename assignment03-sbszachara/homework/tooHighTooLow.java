//Steven Szachara
//HW3 SWEN 601
package homework;
//import the Random for the random num gen
import java.util.Random;
import java.util.Scanner;

//declare class
public class tooHighTooLow {

    //boolean function to see if the number is higher, lower, or correct
    //returns false unless they equal, which returns true
    public static boolean compareHL(int a, int b) {
        if (a > b) {
            System.out.println("Too Low!");
            return false;
        }
        else if (a < b) {
            System.out.println("Too High!");
            return false;
        }
        else {
            System.out.println("Correct!");
            return true;
        }
    }

    //main
    public static void main(String args[]) {

        //declares random generator
        Random rando = new Random();
        //declares scanner
        Scanner reader = new Scanner(System.in);
        //randomly generates an int between 1-10, have to + 1 because just 10 is 0-9
        int r = rando.nextInt(10) + 1;

        //message to user
        System.out.println("Guess the number:");
        //declares what their guess will be
        int guess;
        //declares a bool that will change based on if the number is correct, initiates first guess
        boolean isCorrect = false;

        //first guess
        if (isCorrect == false) {

            //first guess prompt
            guess = reader.nextInt();
            isCorrect = compareHL(r, guess);
            
            //check to see if first guess is false, then goes
            //to second guess
            if (isCorrect == false)
            {
                System.out.println("Try again!");

                //second guess
                guess = reader.nextInt();
                isCorrect = compareHL(r, guess);
                
                //goes to third guess if wrong
                if (isCorrect == false)
                {
                    System.out.println("Try again!");

                    //third guess
                    guess = reader.nextInt();
                    isCorrect = compareHL(r, guess);
                    
                    //final results
                    if(isCorrect == true) {
                        System.out.println("You got it!");
                    }

                    else {
                        System.out.println("You ran out of guesses!");
                    }
                }

                //below else statements are if they user gets the guess right in their first 2 guesses
                else {
                    System.out.println("You got it!");
                }

            }
            //user got it on second guess
            else {
                System.out.println("You got it!");
            }
        }
        //user got it on guess 1
        else {
            System.out.println("You got it!");
        }

        reader.close();

    }
    //end main
    
}
//end class
