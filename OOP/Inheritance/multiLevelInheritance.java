// Multi level inheritance
class Shape{
    int l;   
}
class Square extends Shape{
    public void area(){
        System.out.println("Area of Square is: "+(l*l));
    }
}
class SquarePerimeter extends Square{
    SquarePerimeter(int l){
        this.l = l;
    }
    public void getPerimeter(){
        System.out.println("Perimeter of Square is: "+(4*l));
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        SquarePerimeter sp = new SquarePerimeter(10);
        sp.area();
        sp.getPerimeter();
    }
}
