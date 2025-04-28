package simpleprojects.src;
import java.util.Scanner;

public class temperatureconverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String message;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit? (C/F): ");

        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp -32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f degrees %s", newTemp, unit);
        
        scanner.close();
    }
}
