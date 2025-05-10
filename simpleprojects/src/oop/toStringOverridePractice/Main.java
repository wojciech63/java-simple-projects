package simpleprojects.src.oop.toStringOverridePractice;

public class Main {
    public static void main(String[] args) {

        /* toString is a method inherited from the object
           Used to return a string representation of an object.
           By default, it returns a has code as a unique identifier.
           It can be overriden to provide meaningful details.
         */

        Car car1 = new Car("BMW", "M3", 2012, "Gray");
        Car car2 = new Car("Mercedes Benz", "SL55", 2008, "Silver");

        System.out.println(car1);
        System.out.println(car2);

    }
}
