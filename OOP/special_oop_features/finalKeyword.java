final class Vehicle {
    final int wheels;

    Vehicle(int w) {
        wheels = w;
    }

    final void start() {
        System.out.println("Vehicle with " + wheels + " wheels is starting...");
    }
}
public class finalKeyword {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(4);

        System.out.println("Wheels: " + v.wheels);

        v.start();

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println(sb);
    }    
}
