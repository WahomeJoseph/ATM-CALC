package Abstraction;

public class AbstractDemo {

    public static void main(String[] args) {

        Graphic circle = new Circle();
        circle.draw();
        circle.resize();

        Graphic rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}
