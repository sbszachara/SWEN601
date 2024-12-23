package activities;

public class Shape {

    private String fillcolor;
    private String linecolor;
    private position shapeposition = new position();

    public Shape(String f, String l, double x, double y) {
        this.fillcolor = f;
        this.linecolor = l;
        this.shapeposition.setx(x);
        this.shapeposition.sety(y); 
    }

    public Shape(position position, String string, String string2) {
        this.shapeposition = position;
        this.fillcolor = string;
        this.linecolor = string2;
    }

    public double Area(){
        return 0.0;
    }

    public double Perimeter(){
        return 0.0;
    }

    public void Move(double x, double y) {
        this.shapeposition.setx(x);
        this.shapeposition.sety(y);
    }

    public void mov(position pos) {
        this.shapeposition = pos;
    }

    @Override
    public String toString() {
        if(this instanceof Shape) {
            Shape s = (Shape)this;
            String r = "Shape" + "\n" + "Fill color: " + s.fillcolor + "\n" + "Line color: " + s.linecolor + "\n" + "Position: " + s.shapeposition;
            return r;

        }
        else {
            return "Not a shape";
        }
    }

    
    
}
