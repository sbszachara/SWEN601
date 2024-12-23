package activities;

import java.util.Scanner;

public class Whatever {

    public static int[] makeArray(int size) {
        int[] array = new int[size];
        for(int index=0; index<array.length; index++) {
            int value = index * 10;
            array[index] = value;
        }
        return array;
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int[] array = makeArray(n);
        for (int index = 0; index<array.length; index++)
        {
            int value = array[index];
            System.out.println(value);
        }
        
        for(int value : array) {
            System.out.println(value);
        }
        scanner.close();

    }
    
}
