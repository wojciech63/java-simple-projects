package simpleprojects.src.oop.fileReadPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "/Users/wojciechdabrowski/Desktop/test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("I/O exception");
        }

    }
}
