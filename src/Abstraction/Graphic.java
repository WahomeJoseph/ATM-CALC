package Abstraction;

public abstract class Graphic {

    int x, y;

    void moveTo(int newX, int newY) {
        System.out.println("Move to x : " + x + " and y : ");
    }

//    abstract methods
//    no braces/implementation
    abstract void draw();
    abstract void resize();
}
