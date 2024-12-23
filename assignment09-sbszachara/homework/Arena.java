package homework;

public class Arena {

    public static void arenaMatch(Pokemon a, Pokemon b){
        System.out.println();
        System.out.println();
        System.out.println(a.toString());
        System.out.println();
        System.out.println();
        System.out.println("VS");
        System.out.println();
        System.out.println();
        System.out.println(b.toString());
        System.out.println();
        System.out.println();

        while(a.getHealth() != 0 && b.getHealth() != 0) {
            //a attacks b
            System.out.println(a.getName() + " attacks " + b.getName() +"!");
            a.Attack(b);
            //damage display
            System.out.println(a.getName() + " does " + a.getDamage(b) + " damage!");
            //Health remaining
            System.out.println(b.getName() + " has " + b.getHealth() + " health remaining");

            if(a.getHealth() == 0){
                System.out.println(b.getName() + " is the winner!");
                break;
            }
            else if (b.getHealth() == 0) {
                System.out.println(a.getName() + " is the winner!");
                break;
            }

            //b attacks a
            System.out.println(b.getName() + " attacks " + a.getName() +"!");
            b.Attack(a);
            //damage display
            System.out.println(b.getName() + " does " + b.getDamage(a) + " damage!");
            //Health remaining
            System.out.println(a.getName() + " has " + a.getHealth() + " health remaining");

            if(a.getHealth() == 0){
                System.out.println(b.getName() + " is the winner!");
                break;
            }
            else if (b.getHealth() == 0) {
                System.out.println(a.getName() + " is the winner!");
                break;
            }
        }

    }
    
}
