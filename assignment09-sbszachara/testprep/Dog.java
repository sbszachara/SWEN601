package testprep;

public class Dog extends Animal {
    
    public Dog(String s) {
        super(s);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

}
