package testprep;

public class Animal {
    private String name;

    public Animal(String n) {
        this.name = n;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }

    public static void main(String args[]) {
        Animal[] animals = new Animal[5];
        Dog dog1 = new Dog("bob");
        Dog dog2 = new Dog("jimbo");
        Cat cat1 = new Cat("Kiwi");
        Cat cat2 = new Cat("Boe");
        Cat cat3 = new Cat("Trolly");

        animals[0] = dog1;
        animals[1] = dog2;
        animals[2] = cat1;
        animals[3] = cat2;
        animals[4] = cat3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }

    }

}
