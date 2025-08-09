// Constructor Overloading
class City{
    String name;
    String state;
    String country;
        City(){
            System.out.println("This is default constructor");
            name = "unknown";
            state = "unknown";
            country = "unknown";
        }
        City(String name, String state, String country){
            this.name = name;
            this.state = state;
            this.country = country;
        }
        void display(){
            System.out.println("City Name: "+ name);
            System.out.println("State: "+ state);
            System.out.println("Country: "+ country);
        }
}
public class constructorOverloading {
    public static void main(String[] args) {
        City mumbai = new City();       //this calls the default constructor
        City pune = new City("Pune", "Maharashtra", "India");  //this calls the parameterised constructor
        mumbai.display();
        pune.display();
    }
}
