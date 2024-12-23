package activities;

public class Dog {
    private static int COUNT = 0;
    
    private String name;
    private int age;
    private String color;
    private double weight;
    private Breed breed;

    public Dog(String n, int a, double w, String c) {
        this.name = n;
        this.age = a;
        this.color = c;
        this.weight = w;
        this.breed = Breed.BASSET;
        COUNT++;
    }

    public static int getDogCount() {
        return COUNT;
    }

    public Breed getBreed() {
        return this.breed;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void feed(double calories) {
        double pounds = calories / 3000;
        this.weight += pounds;
    }

    public void walk(double distance) {
        double calories = distance * 100;
        double pounds = calories / 3000;
        this.weight -= pounds;
    }

    @Override
    public String toString() {
        return name + " is a " + color + " dog that is " + age + " and weighs " + weight + " poundage";
    }

    public boolean equals(Object o) {
        if(o instanceof Dog) {
            Dog other = (Dog)o;
            return this.age == other.age 
                && this.color.equals(other.color);
        } else {
            return false;
        }
    }
    
}
