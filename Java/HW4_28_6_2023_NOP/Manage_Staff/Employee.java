package HW4_28_6_2023_NOP.Manage_Staff;

import java.util.Scanner;

public class Employee extends Manage_Staff{
    private int time;
    private int wage_time = 20000; //lương theo giờ
    private String type_staff = "Employee";
    Scanner sc = new Scanner(System.in);
    
    public Employee(){
        super();
    };

    public Employee(String name, Integer age, String email, int time) {
        super(name, age, email);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getWage_time() {
        return wage_time;
    }

    public void setWage_time(int wage_time) {
        this.wage_time = wage_time;
    }

    public String getType_staff() {
        return type_staff;
    }

    public void setType_staff(String type_staff) {
        this.type_staff = type_staff;
    }
    

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.println("Nhap so gio lam viec: ");
        time = sc.nextInt();
        // System.out.println("Nhap luong co ban theo gio: ");
        // sc.nextDouble();
    }

    @Override
    public double tinhLuong() {
        double luong = wage_time* time;
        return luong;
    }

    @Override
    public String toString() {
        return super.toString() +"time=" + time + ", wage_time=" + wage_time + ", type_staff=" + type_staff + "]";
    }
    
}
