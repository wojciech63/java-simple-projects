package simpleprojects.src.oop.compositionPractice;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("SL55", 2007, "N/A V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
