package JavaAbstractions;

abstract class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");

    }
    public void walk(){
        System.out.println("Horse walks on 4 legs.");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks on 2 legs.");
    }
}

public class Abstractons1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        
    }
}
