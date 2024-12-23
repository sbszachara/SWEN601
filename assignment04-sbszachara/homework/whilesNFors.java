// STEVEN SZACHARA
// HW4 SWEN 601

package homework;
import java.util.Scanner;

public class whilesNFors {

    //create method using for loop whether or not a given 64-bit integer is a prime number
    //returns boolean
    public static boolean forIsPrime(int n) {
        //checks to see if negative or xero
        if (n <= 1) {
            return false;
        }
        //starts at 2 and goes through
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                return false;
            }
        //if it passes this the number is prime
        return true;
    }

    //create mehtod using while loop with same algo, prime number
    //returns boolean
    public static boolean whileIsPrime(int n) {
        //starts at 2 as 0 or 1 are not prime or composite
        int i = 2;
        if (n <= 1) {
            return false;
        }
        //while loop to check if it is prime
        while (i <= Math.sqrt(n)){
            if (n % i == 0) {
                return false;
            }
            i = i + 1;
        }
        //if it comes out of the loop okay, it is prime
        return true;
    }

    //create method using a do while loop
    //returns boolean whether prime or not
    public static boolean doWhileIsPrime(int n) {
        //starts at 2 as 0 or 1 are not prime or composite
        int i = 2;
        //checks to see if the number is negative, 0, or 1
        if (n <= 1) {
            return false;
        }
        //checks to see if it is 2, then just returns true
        if (n == 2) {
            System.out.println("Number is prime");
            return true;
        }
        //checks all other cases of prime in do loop
        do { 
            if (n % i == 0){
                return false;
            }
            i = i + 1;
        } while (i <= Math.sqrt(n));
        return true;
    }

    //main should ask user for input and a character "f", "w", or "d" to do each method
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        //prompts user with number to go up to primes with
        System.out.println("Enter an integer:");
        //gets number
        int number = reader.nextInt();
        //gets the type of loop to do
        System.out.println("Enter f, w, or d");
        String letter = reader.next();

        //checks to see if it is not zero and also if it wants a for loop
        if (letter.equals("f") && number > 0){
            long startTime = System.currentTimeMillis();
            for (int i = 1; i <= number; i++)
            {
                if (forIsPrime(i) == true) {
                    System.out.println(i);
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("This took: " + (endTime-startTime) + "ms");
        }
        //checks to see if it wnts a while loop
        else if (letter.equals("w") && number > 0) {
            int i = 1;
            long startTime = System.currentTimeMillis();
            while (i <= number) {
                if (whileIsPrime(i)) {
                    System.out.println(i);
                }
                i = i + 1;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("This took: " + (endTime-startTime) + "ms");
        }
        //checks to see if it wants a do while loop
        else if (letter.equals("d") && number > 0) {
            int i = 1;
            long startTime = System.currentTimeMillis();
            do {
                if (doWhileIsPrime(i)) {
                    System.out.println(i);
                }
                i = i + 1;
            } while (i <= number);
            long endTime = System.currentTimeMillis();
            System.out.println("This took: " + (endTime-startTime) + "ms");
        }
        //says its not valid if you type anything else in there, or if it is a 0
        else
        {
            System.out.println("Not valid, either number was 0 or not a correct choice.");
        }

    } //end main
    
} //end class
