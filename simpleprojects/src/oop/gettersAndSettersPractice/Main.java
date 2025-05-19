package simpleprojects.src.oop.gettersAndSettersPractice;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("SL55", "Silver", 23000);

        car.setPrice(0);
        car.setColor("Gray");
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
