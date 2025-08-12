abstract class pen{
    String name = "gelpen";
    pen(){
        System.out.println("pen is created");
    }

}
class ballPen extends pen{
    ballPen(){
        System.out.println("ball pen is created");
    }
    public void details(){
        System.out.println("Name: "+name);
    }

}
public class sample {
    public static void main(String[] args) {
        ballPen bp = new ballPen();
        bp.details();
    }
}
