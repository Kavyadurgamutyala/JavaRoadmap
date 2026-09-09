package Day10_Abstraction;
abstract class Shape {

    abstract void draw();

}

public class ShapeCircle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {

        ShapeCircle c = new ShapeCircle();

        c.draw();
    }
}