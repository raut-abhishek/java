//  Loop through characters to traverse on every character
public class LoopThroughString {
    public static void main(String[] args) {
        String name = "astronauts";
        System.out.print("All letters are : ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }
}
