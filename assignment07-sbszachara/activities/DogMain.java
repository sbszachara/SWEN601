package activities;

public class DogMain {
    public static void main(String[] args) {
        Dog harry = new Dog("harry", 10, 100, "black");
        Dog dormie = new Dog("dormie", 2, 75, "black");
        System.out.println(dormie.getWeight());
        System.out.println(harry.getName());
        System.out.println(harry.getAge());
        System.out.println(harry.getColor());
        System.out.println(harry.getWeight());

        harry.feed(1000);
        System.out.println(harry.getWeight());
        dormie.walk(1.5);
        System.out.println(dormie.getWeight());
        System.out.println(dormie);

        Dog spot = new Dog ("Spot", 0, 8, "Blonde");
        Dog luna = new Dog ("Spot", 0, 8, "Blonde");
        System.out.println(luna == spot);
        System.out.println(luna.equals(spot));


    }
    
}
