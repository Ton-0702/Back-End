package OOP_Practice_26_6_2023.Practice.Interface;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar("Ferrari");
        sportsCar.start();
        sportsCar.drive(100.5);
        sportsCar.stop();

        Car sedan = new Sedan("Toyota");
        sedan.start();
        sedan.drive(75.2);
        sedan.stop();
    }
}
