// Constructor concept
public class Laptop {
    String brand;
    String model;
    String processor;
    int ramSize;
    int storage;
    int price;

    Laptop(String brand, String model, String processor, int ramSize, int storage, int price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storage = storage;
        this.price = price;
    }

    void showSpecs() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Processor : " + processor);
        System.out.println("RamSize : " + ramSize);
        System.out.println("Storage : " + storage);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Apple", "Macbook", "M3 ultra", 32, 1000, 200000);
        myLaptop.showSpecs();
    }
}
