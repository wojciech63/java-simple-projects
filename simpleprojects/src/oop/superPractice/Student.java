package simpleprojects.src.oop.superPractice;

public class Student extends Person {

    double gpa;

    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}
