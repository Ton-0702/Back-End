package OOP_27_6_2023.OOP_Access_Modified_27_6_2023;

public class ChildClass extends ParentClass {
    public void childMethod(){
        System.out.println("This is a child method");
        System.out.println("Accessing the protected variable from the parent class: "+protectedVariable);

    }
}
