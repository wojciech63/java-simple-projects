package simpleprojects.src.oop.staticPractice;

public class Friend {

    static int numOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " friends");
    }

}
