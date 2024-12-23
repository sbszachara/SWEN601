package testprep;

public class Cat extends Animal {
    
    public Cat (String s) {
        super(s);
    }

@Override
    public void makeSound() {
        System.out.println("Meow");
    }

}
