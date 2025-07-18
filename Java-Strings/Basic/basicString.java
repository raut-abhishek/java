public class basicString {
    public static void main(String[] args) {
        String name = "Abhishek";
        System.out.println("Original: " + name);                    // Printing string
        
        System.out.println("Length: " + name.length());               //name.length() gives length of the string
        System.out.println("First letter: " + name.charAt(0));  //.charAt(0) allows to acceccs perticular characterstics of string
        System.out.println("Last letter: " + name.charAt(name.length() - 1));
    }
}
