class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void getColor() {
        System.out.println(this.color); // this keyword tells that which object is accessing the property
    }
}

public class ClassObjects1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // created object for the class
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen(); // created second object for the class
        pen2.color = "Red";
        pen2.type = "Roller";

        pen1.getColor();
        pen2.getColor();
    }
}