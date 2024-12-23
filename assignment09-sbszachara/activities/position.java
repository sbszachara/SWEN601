package activities;

public class position {
    private double x;
    private double y;

    public position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public position(){
        this.x = 1;
        this.y = 1;
    }

    public double gety() {
        return y;
    }

    public double getx() {
        return x;
    }

    public void sety(double s) {
        this.y = s;
    }
    
    public void setx(double s) {
        this.x = s;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof position) {
            position p = (position)obj;
            return this.x == p.x && this.y == p.y;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        position p1 = new position(5, 7);
        position p2 = new position(-12, 23);
        position p3 = new position(5, 7);

        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));
    }
}
