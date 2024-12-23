//STEVEN SZACHARA
//SWEN 601

package homework;
import java.util.Scanner;

public class sieve {

//     Create a list of consecutive integers from 2 through n: (2, 3, 4, ..., n).
//      Initially, let p equal 2, the smallest prime number.
//      Enumerate the multiples of p by counting in increments of p from 2p to n, and mark them in the list (these will be 2p, 3p, 4p, ...; the p itself should not be marked).
//      Find the smallest number in the list greater than p that is not marked. If there was no such number, stop. Otherwise, let p now equal this new number (which is the next prime), and repeat from step 3.
//      When the algorithm terminates, the numbers remaining not marked in the list are all the primes below n.

    public static void main(String args[]) {
        boolean[] bigBoi = new boolean[10000000];
        Scanner reader = new Scanner(System.in);

        //sets up my initial values to handle the early boolean rules
        bigBoi[0] = false;
        bigBoi[1] = false;
        bigBoi[2] = true;

        //sets up my boolean as everything is true, to then clarify below
        for (int j = 3; j < bigBoi.length; j++) {
            bigBoi[j] = true;
        }

        //takes user integer
        System.out.println("Please give an integer:");
        int n = reader.nextInt();

        //the p for the sieve algo
        int p = 2;
        //x is my multiplier
        int x = 2;
        //this is my kill for the total while loop
        boolean kill = false;

        //big while loop for sieve
        while(p < bigBoi.length) {
            //making the multiples false in the boolean array to say they are not prime
            while ((x*p) < bigBoi.length) {
                bigBoi[(x*p)] = false;
                x = x + 1;
            }
            //loop that starts at p+1, stopping when it gets to a true value in my big array
            //then sets p to that true value
            for (int t = p+1; t < bigBoi.length; t++) {
                //if we find a number that hasn't been eliminated before, set that as p
                if (bigBoi[t] == true) {
                    p = t;
                    //this resets kill
                    kill = false;
                    break;
                }
                //if we go all the way through we kill the big loop
                else {
                    kill = true;
                }
            }
            //this is to kill the big while loop
            if (kill == true) {
                break;
            }
            //this resets our multiplyer
            x = 2;
        }

        //sets time stamp to measure the total execution time of printing the first n primes
        long startTime = System.currentTimeMillis();

        //the printing while loop prints the amount of primes the user wants
        int t = 0;
        int goThrough = 0;
        while (t < n) {
            if (bigBoi[goThrough] == true) {
                System.out.println(goThrough);
                t = t + 1;
                goThrough = goThrough + 1;
            }
            else {
                goThrough = goThrough + 1;
            }
        }

        //stamps the time that it took to get through all
        long endTime = System.currentTimeMillis();
        //prints the total time it took
        System.out.println("This took: " + (endTime-startTime) + "ms");

        reader.close();

        }//end class
    }// end main
