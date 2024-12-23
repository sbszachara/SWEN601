package homework;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Random random = new Random();
        int minattack = 50;
        int maxattack = 100;
        int minhealth = 500;
        int maxhealth = 1000;

        Scanner reader = new Scanner(System.in);
        System.out.println();
        System.out.println("Would you like to watch a battle?");
        System.out.println("1 for Yes or 0 to Quit:");
        int yesorno = reader.nextInt();

        while (yesorno != 0) {
            int health1 = (random.nextInt(maxhealth-minhealth+1)+minhealth);
        int health2 = (random.nextInt(maxhealth-minhealth+1)+minhealth);
        int attack1 = random.nextInt(maxattack-minattack+1)+minattack;
        int attack2 = random.nextInt(maxattack-minattack+1)+minattack;

        Pokemon normaltype1 = new Pokemon("Normal Steven", attack1, health1);
        Fire firetype1 = new Fire("Fire Steven", attack1, health1);
        Water watertype1 = new Water ("Water Steven", attack1, health1);
        Grass grasstype1 = new Grass ("Grass Steven", attack1, health1);

        Pokemon normaltype2 = new Pokemon("Normal 2 Steven", attack2, health2);
        Fire firetype2 = new Fire("Fire 2 Steven", attack2, health2);
        Water watertype2 = new Water ("Water 2 Steven", attack2, health2);
        Grass grasstype2 = new Grass ("Grass 2 Steven", attack2, health2);

        int type1 = random.nextInt(4);
        int type2 = random.nextInt(4);

        Pokemon first = new Pokemon();
        Pokemon second = new Pokemon();

        //pick the random pokemon
        if (type1 == 0){
            first = normaltype1;
        }
        else if (type1 == 1) {
            first = firetype1;
        }
        else if (type1 == 2) {
            first = watertype1;
        }
        else {
            first = grasstype1;
        }

        //pick the second random pokemon
        if (type2 == 0){
            second = normaltype2;
        }
        else if (type2 == 1) {
            second = firetype2;
        }
        else if (type2 == 2) {
            second = watertype2;
        }
        else {
            second = grasstype2;
        }
        Arena.arenaMatch(first, second);
        System.out.println();
        System.out.println("Would you like to watch another battle?");
        System.out.println("1 for Yes or 0 to Quit:");
        yesorno = reader.nextInt();
        }

    }
    
}
