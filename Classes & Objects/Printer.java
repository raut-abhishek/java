// Method Overloading concept

public class Printer {
    void print(int number) {
        System.out.println("Printing int: " + number);
    }

    void print(String text) {
        System.out.println("Printing string: " + text);
    }

    void print(String text1, String text2) {
        System.out.println("Printing 2 strings: " + text1 + " & " + text2);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);
        p.print("Abhishek");
        p.print("Hello", "World");
    }
}
