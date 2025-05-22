package simpleprojects.src.oop.arraylistPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");

        // fruits.remove(2);
        // fruits.set(0, "Pineapple");

        // System.out.println(fruits.get(3));
        // System.out.println(fruits.size());

        Collections.sort(fruits);

        // System.out.println(fruits);

        for(String fruit : fruits) {
            System.out.println(fruit);

         */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfFood; i++) {
            System.out.print("Add your food: ");
            String food = scanner.nextLine();
            list.add(food);
        }

        System.out.println(list);

        scanner.close();
        }

    }
