// Method overloading

public class Calculator {
    void add(int a, int b) {
        System.out.println("Addition of " + a + "+" + b + " = " + (a + b));
    }

    void add(double c, double d) {
        System.out.println("Addition of " + c + "+" + d + " = " + (c + d));
    }

    void add(int e, int f, int g) {
        System.out.println("Addition of " + e + "+" + f + "+" + g + " = " + (e + f + g));
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10, 20);
        cal.add(100.0, 200.0);
        cal.add(1000, 2000, 3000);
    }
}
