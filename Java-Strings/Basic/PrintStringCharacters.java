public class PrintStringCharacters {
    public static void main(String[] args) {
        String name = "Abhishek";
        System.out.print("Characters: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }
}
