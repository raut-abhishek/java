public class RemoveSpaces {
    public static void main(String[] args) {
        String name = "hello abhishek";
        String result = name.replaceAll(" ", ""); // used replace method to replace space with the blank
        System.out.println("Orignal string : " + name);
        System.out.println("Without spaces: " + result);
    }
}