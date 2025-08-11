// Inheritance
class Shape{
    String color;
}
class Triangle extends Shape{
    public void display(){
        System.out.println("Color : " + color);
    }
}

public class inheritance1{
    public static void main(String[] args) {
       Triangle t1 = new Triangle();
       t1.color = "Red";
       t1.display();
    }
}