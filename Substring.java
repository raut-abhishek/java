public class Substring {
    public static void main(String[] args) {
        // substring is a part of the string. ex= Abhishek, substring can be = Abhi
        String name = "Abhishek";
        String newName = name.substring(0,4); 
        System.out.println("Orignal string : " + name);
        System.out.println("substring : " + newName);
    }
}
// to create a substring use .substring(startIndex, endIndex); endIndex is excluded