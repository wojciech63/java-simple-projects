package simpleprojects.src.oop.superPractice;

public class Main {
    public static void main(String[] args) {

        /*
        super refers to the parent class (subclass <- superclass)
        Used in constructors and method overriding
        Calls the parent constructor to initialize attributes
         */


        Person person = new Person("Harry", "Potter");
        Student student = new Student("Tom", "Riddle", 3.9);
        Employee employee = new Employee("Ron", "Wesley", 12500);

        person.showName();
        student.showName();
        student.showGpa();
        employee.showSalary();
    }
}
