package simpleprojects.src.oop.interfacePractice;

public class Main {

    public static void main(String[] args) {
        /*
        Interface is a blueprint for a class that specifies a set
        of abstract methods that implementing classes MUST define.
        Supports multiple inheritance-like behavior.
         */

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();
    }

}
