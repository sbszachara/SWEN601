package activities;

public class multplication {
    public static void main(String args[]) {
        int[][] table = new int[10][10];
        int i = 1;
        int o = 1;
        for (int row=0; row<table.length; row++) {
            System.out.println();
            for(int col=0; col<table[row].length; col++) {
                table[row][col] = i*o;
                o = o + 1;
                System.out.print(" " + table[row][col] + " ");
            }
            o = 1;
            i = i + 1;
        }
        System.out.println();
    }
}
