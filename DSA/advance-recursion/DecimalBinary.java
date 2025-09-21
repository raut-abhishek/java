// Recursive binary to decimal / decimal to binary conversion
public class DecimalBinary {

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        }
        return decimalToBinary(decimal / 2) + (decimal % 2);
    }

    public static void main(String[] args) {
        int decimal = 11;
        String binary = decimalToBinary(decimal);
        System.out.println("Binary: " + binary);
    }
}
