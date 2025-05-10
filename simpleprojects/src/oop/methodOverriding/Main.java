package simpleprojects.src.oop.methodOverriding;

public class Main {
    public static void main(String[] args) {
        /*
        method overriding is when a subclass provides its own
        implementation of a method that is already defined.
        Allows for code reusability and give specific info.
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
