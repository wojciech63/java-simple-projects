package simpleprojects.src.oop.abstractionPractice;

public class Main {
    public static void main(String[] args) {

        /*
        Abstraction is used to define abstract classes and methods.
        Abstraction is the process of hiding implementation details
        and showing only the essential features;
        Abstract classes can't be instantiated directly
        Can contain 'abstract' methods (which must be implemented)
        Can contain 'concrete' methods (which are inherited)
         */

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,8);

        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
        System.out.println(rectangle.getArea());
        circle.display();

    }
}
