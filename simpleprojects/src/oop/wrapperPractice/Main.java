package simpleprojects.src.oop.wrapperPractice;

public class Main {
    public static void main(String[] args) {
/*
        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = 'c';
        Boolean d = true;

        // Unboxing
        int x = a;
        double y = b;
        char z = c.charValue();
        boolean w = d;
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
        System.out.println(w);

        String aa = Integer.toString(123);
        String bb = Double.toString(3.14);
        String cc = Character.toString(c);
        String dd = Boolean.toString(d);

        String abcd = aa + bb + cc + dd;
        System.out.println(abcd);


        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");
*/
        char letter = 'B';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
