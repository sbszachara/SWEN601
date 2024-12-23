package activities;
import java.util.Scanner;

public class Calculator {
    private Operation[] operations;

    public Calculator(Operation[] operations) {
        this.operations = operations;
    }

    public void calculate(String operator, double[] values) {
        //checks to see if a correctop is being used
        boolean correctop = false;
        //loops through the operations of the calculator created
        //to see if the operation has a match
        for (Operation operation : this.operations) {
            //if matches the operation in the operations array
            if(operation.matches(operator) == true) {
                //set the correctop to true to send the error message
               correctop = true;
               //prints the operation on the values array parsed in
               System.out.println("Result is: " + operation.operation(values));
               //breaks the loop of searching
               break;
            }
        }
        //prints the error only if correctop is still false
        if (correctop == false) {
            System.out.println("Unknown operator: " + operator);
        }
    }

    public static void main(String[] args) {
        //set up of the main scanner
        Scanner reader = new Scanner(System.in);
        //input is the initial input of the user
        String input = "";
        //this will build the array of values to perform operation on
        int lengthofvalues = 0;

        //here we have the list of operations we can use
        //I wanted to make sure if future operations were to be added
        //it could accomodate
        Sum sum = new Sum();
        Multiply multiply = new Multiply();
        Modulo modulo = new Modulo();
        IntegerDiv integerdiv = new IntegerDiv();
        Exponent exponent = new Exponent();
        Divide divide = new Divide();
        Difference difference = new Difference();
        
        //setting up the array of operations to create the calculator
        Operation[] operations = {sum, multiply, modulo, integerdiv, exponent, divide, difference};

        //creating the calculator
        Calculator calculator = new Calculator(operations);

        //while loop for the calculator that quits when quit
        while (input.equals("quit") != true) {
            System.out.println("Enter a operator: ");
            input = reader.nextLine();

            //breaks for just quit
            if(input.equals("quit")) {
                break;
            }
            //splits input into strings by spaces
            String[] splitter = input.split(" ");
            //gets the length to build the values array
            for(int i = 1; i < splitter.length; i++) {
                if(splitter[i] != null) {
                    lengthofvalues = lengthofvalues + 1;
                }
            }
            //builds the values array to put into the calculator
            double[] allthevalues = new double[lengthofvalues];
            //loops the string and puts the double values into the values array
            for(int i = 1; i < splitter.length; i++) {
                if(splitter[i] != null) {
                    allthevalues[i-1] = Double.parseDouble(splitter[i]);
                }
            }
            //executes the calculator onto the operation and the values
            calculator.calculate(splitter[0], allthevalues);
            //resets the length of the values array
            lengthofvalues = 0;
        }
    }
}
