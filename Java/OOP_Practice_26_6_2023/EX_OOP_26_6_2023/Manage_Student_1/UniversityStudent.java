package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Manage_Student_1;

public class UniversityStudent implements Student {
    private String name;

    public UniversityStudent(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println(name + " La hoc vien dai hoc");
    }
}