
public class Operators {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        // Binary Operators
        System.out.println("Binary Operation result");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
        // Unary operators
        System.out.println("Unary Operation result");
        System.out.println(a++);
        System.out.println(++a);
        // Unary operators
        System.out.println("Relational Operation result");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        //Logical Operators 
        if (a>b && b<a){    //Logical and (&&)
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if (a==b || b<a){    //Logical OR (||)
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if (!(a>b)){    //Logical Not (!)
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
