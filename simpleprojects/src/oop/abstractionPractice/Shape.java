package simpleprojects.src.oop.abstractionPractice;

public abstract class Shape {

    abstract double getArea(); //abstract method

    // concrete method
    void display(){
        System.out.println("This is a shape");
    }

}
