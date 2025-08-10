// Function overloading also known as compiletime polymorphism
class Car{
    String brand;
    String name;
    int price;

    public void printDetails(String brand){
        System.out.println(brand);
    }
    public void printDetails(String name, int price){
        System.out.println(name + " " + price);
    }
    public void printDetails(int price){
        System.out.println(price);
    }
    public void printDetails(String brand, String name, int price){
        System.out.println(brand + " " + name + " " + price);
    }
}
public class functionOverloading2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.name = "Camry";
        car.price = 30000;
        car.printDetails(car.brand);
        car.printDetails(car.name, car.price);
        car.printDetails(car.brand, car.name, car.price);
    }
}
