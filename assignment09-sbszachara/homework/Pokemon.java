package homework;

public class Pokemon {
    private PokeType type;
    private String name;
    private int attack;
    private int health;
    private boolean concious;

    public Pokemon() {
        this.name = "No Name Pokemon";
        this.attack = 20;
        this.health = 100;
        this.concious = true;
        this.type = PokeType.NORMAL;
    }

    public Pokemon(String n, int a, int h) {
        this.name = n;
        this.attack = a;
        this.health = h;
        this.concious = true;
        this.type = PokeType.NORMAL;
    }

    public String getName() {
        return this.name;
    }
    public PokeType getType() {
        return this.type;
    }
    public void setType(PokeType t) {
        this.type = t;
    }

    public void setUnConcious(){
        this.concious = false;
    }

    public void setConvious() {
        this.concious = true;
    }

    public void setHealth(int h) {
        this.health = h;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public void Attack(Object obj) {
        Pokemon attackedPokemon = (Pokemon)obj;
        if(attackedPokemon.health-this.attack <= 0) {
            attackedPokemon.health = 0;
            attackedPokemon.setUnConcious();
        }
        else {
            attackedPokemon.health = attackedPokemon.health - this.attack;
        }
    }

    public boolean isConscious() {
        return this.concious;
    }

    @Override
    public String toString() {
        if(this instanceof Pokemon) {
            return "Pokemon Name: " + this.name + "\n" + "Type: " + this.type + "\n" + "Attack: " + this.attack + "\n" + "Health: " + this.health;
        }
        else {
            return "Not a pokemon";
        }
    }

    public int getDamage(Object obj) {
        Pokemon p = (Pokemon)obj;
        if ((this.getType() == PokeType.FIRE && p.getType() == PokeType.GRASS)) {
            return this.getAttack()*2;
        }
        else if ((this.getType() == PokeType.FIRE && p.getType() == PokeType.WATER)){
            return this.getAttack()/2;
        }
        else if ((this.getType() == PokeType.GRASS && p.getType() == PokeType.FIRE)){
            return this.getAttack()/2;
        }
        else if ((this.getType() == PokeType.GRASS && p.getType() == PokeType.WATER)){
            return this.getAttack()*2;
        }
        else if ((this.getType() == PokeType.WATER && p.getType() == PokeType.FIRE)){
            return this.getAttack()*2;
        }
        else if ((this.getType() == PokeType.WATER && p.getType() == PokeType.GRASS)){
            return this.getAttack()/2;
        }
        else {
            return this.getAttack();
        }
    }


}
