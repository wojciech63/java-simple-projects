package simpleprojects.src.oop.practiceConstructor;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 25, 1.5);
        Student student3 = new Student("Michael", 15, 2.3);

        student1.study();
        student2.study();
        student3.study();


    }
}
