package testprep;

public class Student {
    private String name;
    private int age;
    private double GPA;

    public Student(String n, int a, double gpa) {
        this.name = n;
        this.age = a;
        this.GPA = gpa;
    }

    public Student() {
        this.name = "Default";
        this.age = 18;
        this.GPA = 2.5;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double g) {
        this.GPA = g;
    }

    @Override
    public String toString() {
        return "Student{name='" + this.name + "', age=" + this.age +", GPA=" + this.GPA + "}";
    }


    
}
