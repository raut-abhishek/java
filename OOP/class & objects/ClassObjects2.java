class Student {
    String name;
    int age;

    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ClassObjects2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 23;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 25;

        s1.getDetails();
        s2.getDetails();
    }
}
