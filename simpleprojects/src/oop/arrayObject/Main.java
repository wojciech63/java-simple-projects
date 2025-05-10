package simpleprojects.src.oop.arrayObject;

public class Main {
    public static void main(String[] args) {

        /*
        Car car1 = new Car("Mercedes SL55", "Silver");
        Car car2 = new Car("BMW M3 e92", "Grey");
        Car car3 = new Car("Ferrari 488 Pista", "Yellow");

        Car[] cars = {car1, car2, car3};


         */

        Car[] cars = {new Car ("Mercedes SL55", "Silver"),
                    new Car("BMW M3 e92", "Grey"),
            new Car("Ferrari 488 Pista", "Yellow")};;

        for (Car car : cars) {
            car.color = "Blue";
        }

        for (Car car : cars) {
            car.drive();
        }


    }
}
