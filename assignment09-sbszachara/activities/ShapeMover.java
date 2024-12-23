package activities;
public class ShapeMover {

    public static void moveShape(Shape shape, position pos) {
        System.out.println(shape);
        shape.mov(pos);
        System.out.println(pos);
    }

    public static void main(String[] args) {
        Shape shape = new Shape(new position(), "red", "blue");
        moveShape(shape, new position(1,2));
    }
    
}
