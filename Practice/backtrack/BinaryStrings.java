package backtrack;

public class BinaryStrings {

    public static void generateBinary(String s, int n){
        if(s.length() == n){
            System.out.println(s);
            return;
        }

        generateBinary(s + "0", n);
        generateBinary(s + "1", n);
    }

    public static void main(String[] args) {
        String s = "";
        int n = 2;
        generateBinary(s, n);
    }
    
}
