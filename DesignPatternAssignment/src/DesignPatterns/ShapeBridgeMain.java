package DesignPatterns;

interface Color {
    void getColorForShape();
}

class RedColor implements Color {
    public void getColorForShape() {
        System.out.print("Red");

    }

}

class BlueColor implements Color {
    public void getColorForShape() {
        System.out.print("Blue");

    }

}

class PinkColor implements Color {
    public void getColorForShape() {
        System.out.print("Pink");
    }

}

abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void getColor();
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    void getColor() {
        color.getColorForShape();
        System.out.println("DesignPatterns.Square\n");

    }
}

class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    void getColor() {
        color.getColorForShape();
        System.out.print("DesignPatterns.Triangle \n");

    }

}


public class ShapeBridgeMain {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new PinkColor());
        triangle.getColor();

        Shape square = new Square(new BlueColor());
        square.getColor();
    }
}
