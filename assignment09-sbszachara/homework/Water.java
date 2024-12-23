package homework;

public class Water extends Pokemon {
    
    public Water(String n, int a, int h) {
        super(n, a, h);
        this.setType(PokeType.WATER);
    }

    @Override
    public void Attack(Object obj) {
        Pokemon attackedPokemon = (Pokemon)obj;
        if(attackedPokemon.getType() == PokeType.FIRE) {
            if(attackedPokemon.getHealth() - (this.getAttack()*2) <= 0) {
                attackedPokemon.setHealth(0);
                attackedPokemon.setUnConcious();
            }
            else {
                attackedPokemon.setHealth(attackedPokemon.getHealth() - (this.getAttack()*2));;
            }
        }
        else if (attackedPokemon.getType() == PokeType.GRASS) {
            if(attackedPokemon.getHealth() - (this.getAttack()/2) <= 0) {
                attackedPokemon.setHealth(0);
                attackedPokemon.setUnConcious();
            }
            else {
                attackedPokemon.setHealth(attackedPokemon.getHealth() - (this.getAttack()/2));;
            }
        }
        else {
            if(attackedPokemon.getHealth() - (this.getAttack()) <= 0) {
                attackedPokemon.setHealth(0);
                attackedPokemon.setUnConcious();
            }
            else {
                attackedPokemon.setHealth(attackedPokemon.getHealth() - (this.getAttack()));;
            }
        }
    }




}
