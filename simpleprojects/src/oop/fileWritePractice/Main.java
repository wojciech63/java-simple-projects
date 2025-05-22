package simpleprojects.src.oop.fileWritePractice;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files

        String filePath = System.getProperty("user.home") + "/Desktop/test.txt";
        String msg = """
                Hello World!
                How are you?
                All good?
                """;

        try(FileWriter writer = new FileWriter(filePath)) {

            writer.write(msg);

            System.out.println("File has been written");

        }catch (FileNotFoundException f){
            System.out.println("File not found");
        }
        catch (IOException e){

            System.out.println("Could not write file");

            System.out.println(e.getMessage());

        }

        // BufferedWriter = Better performance for large amount of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files etc.)
    }
}
