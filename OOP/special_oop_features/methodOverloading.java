class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class methodOverloading {
     public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));       // calls int method
        System.out.println(c.add(2.5, 3.5));   // calls double method
        System.out.println(c.add(1, 2, 3));    // calls 3-param method
    }
}
