package simpleprojects.src.oop.abstractionPractice;

public class Rectangle extends Shape {

    double width;
    double length;

    Rectangle(double width, double length) {

        this.width = width;
        this.length = length;

    }

    @Override
    public double getArea() {
        return width * length;
    }

}
