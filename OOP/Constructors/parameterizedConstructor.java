// Parameterized Constructor
class Laptop{
    String brand;
    String model;
    int price;

    Laptop(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price + " INR");
    }
}

public class parameterizedConstructor {
    public static void main(String[] args) {
        Laptop mylaptop = new Laptop("Apple", "macboo",120000);
        mylaptop.displayDetails();
    }
}
