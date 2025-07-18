public class StringOperations {
    public static void main(String[] args) {
        String name1 = "abhishek";
        String surName = "raut";
        System.out.println("First letter : " + name1.charAt(0)); // print first letter

        System.out.println("Last letter : " + name1.charAt(name1.length() - 1)); // print last letter

        System.out.println("Third letter : " + name1.charAt(2)); // print third letter
        
        System.out.println("Total letters : " + name1.length()); // print total no. of letters

        String fullName = name1 + " " + surName; // Concatenate Strings
        System.out.println(fullName);

        System.out.println("First 4 letters : " + name1.substring(0, 4)); // Create subString

        System.out.println("Are both strings are equal : " + name1.equals(surName)); // Compare two Strings

        System.out.println("check string contains abhi : " + name1.contains("abhi")); // Check if String contains something
 
        System.out.println("replace abhishek with chetan : " + name1.replace("abhishek", "chetan")); // replace letters

        System.out.println("Convert in uppercase : " + name1.toUpperCase()); // Convert to upper case

        System.out.println("Convert in lowercase : " + name1.toLowerCase()); // Convert to lower case

    }
}
