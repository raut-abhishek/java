// Default constructor
class Car{
    Car(){
        System.out.println("This is default Constructor");
    }
    void display(){
        System.out.println("This is display method");
    }
}

public class defaultConstructor{
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}