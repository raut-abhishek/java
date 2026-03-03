package JavaInterfaces;

interface Animal{
    int eyes = 2;
    void walk();

}

interface Herbivore{
    void eats();
}

class Horse implements Animal, Herbivore{
    public void eats(){
        System.out.println("Horse is herbivore");
    }
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }
    
}
