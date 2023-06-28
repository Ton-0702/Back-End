package HW4_28_6_2023_NOP.Manage_Staff;

import java.util.Scanner;

public class Manage_Staff {
    private String name;
    private Integer age;
    private String email;
    Scanner sc = new Scanner(System.in);

    public Manage_Staff(){
        super();
    }
    
    public Manage_Staff(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhap(){
        System.out.println("Nhap ten nhan vien: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien: ");
        age = sc.nextInt();
        sc.nextLine();
        // System.out.println("Nhap vi tri nhan vien: ");
        // sc.nextLine();
        System.out.println("Nhap email nhan vien: ");
        email = sc.nextLine();
    }

    public double tinhLuong(){
        return 0;
    }


    @Override
    public String toString() {
        return "Manage_Staff [name=" + name + ", age=" + age + ", email=" + email + ", ";
    }


    
    
}
