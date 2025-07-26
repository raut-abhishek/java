public class plane {
    String name;
    String manufacturer;
    int model;
    String type;
    int price;

    void details(){
        System.out.println("Name : " + name);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Model : " + model);
        System.out.println("Type : " + type);
        System.out.println("Price : " + price);
    }
    public static void main(String[] args){
        plane p = new plane();
        p.name = "Dreamliner";
        p.manufacturer = "Boeing";
        p.model = 747;
        p.type = "Commercial jet";
        p.price = 5000000;

        p.details();
    }
}

