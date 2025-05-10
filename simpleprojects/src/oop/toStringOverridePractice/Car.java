package simpleprojects.src.oop.toStringOverridePractice;

public class Car {

    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    @Override
    public String toString() {
        return this.color + " " + this.make + " " + this.model + " " + this.year;
    }

}
