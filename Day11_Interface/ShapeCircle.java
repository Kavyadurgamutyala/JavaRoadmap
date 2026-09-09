package Day11_Interface;

interface Shape {

    void draw();

}

public class ShapeCircle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {

        ShapeCircle c = new ShapeCircle();

        c.draw();

    }
}
