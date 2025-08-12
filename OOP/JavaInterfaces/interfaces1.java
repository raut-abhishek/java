package JavaInterfaces;

interface Animal{
    int eyes = 2;
    void walk();

}
interface Harbivore{

}

class Horse implements Animal, Harbivore{
    public void walk() {
        System.out.println("Horse is walking");
    }
}
public class interfaces1 {
    public static void main(String[] args) {
        Animal horse = new Horse();
        horse.walk();
        
    }
}
