package LeetCode;

import java.io.*;

class TestClass{
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(reader.readLine().trim());

    for (int j = 0; j < T; j++){
        String line = reader.readLine();
        String parts[] = line.trim().split("\\s+");
        int N = Integer.parseInt(reader.readLine());
    for (int i = 1; i <= N; i++){
        if (i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (i % 5 == 0){
            System.out.println("Buzz");
        }
        else if (i % 3 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(i);
        }
    }
}
}
}

/*
 * 
 * //imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT



        // Write your code here

        int begin = 0;
        int end = 15;

        for (int i = begin; i < end; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        

    }
}

 */