// Single level inheritance
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
    public void area(int b, int h){
        System.out.println((b*h)/2);
    }
}


public class singleLevelInheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(10, 20);
        t.area();
    }
}
