package OOP_Practice_26_6_2023.Practice;

public class OOP_Car {
    // Instance variables
    private String brand;
    private String color;
    private int year;

    // Constructor
    public OOP_Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Methods
    public void start(){
        System.out.println("The car is starting");
    }

    public void drive(){
        System.out.println("The car is driving");
    }

    public void stop(){
        System.out.println("The car has stopped.");
    }

    public void displayInfo() {
        System.out.println("Brand: "+ brand);
        System.out.println("Color: "+ color);
        System.out.println("Year: "+year);
    }
}
