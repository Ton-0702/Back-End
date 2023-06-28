package OOP_27_6_2023.OOP_Access_Modified_27_6_2023;

public class Main {
    public static void main(String[] args){
        ChildClass childObject = new ChildClass();

        // Accessing protected members from the child class
        childObject.childMethod();
    }
}
