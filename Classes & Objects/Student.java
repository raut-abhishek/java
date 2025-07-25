// basic class and object
public class Student {
    String name;
    int age;
    int rollNo;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 23;
        s1.rollNo = 101;

        s1.displayInfo();
    }
}
