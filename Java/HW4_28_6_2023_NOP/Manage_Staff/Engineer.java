package HW4_28_6_2023_NOP.Manage_Staff;

import java.util.Scanner;

public class Engineer extends Manage_Staff{
    private int time;
    private int wage_time = 80000; //lương theo giờ
    private String type_staff = "Engineer";
    Scanner sc = new Scanner(System.in);

    public Engineer(){
        super();
    }

    public Engineer(String name, Integer age, String email, int time) {
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

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    
    
    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.println("Nhap so gio lam viec: ");
        time = sc.nextInt();
    }

    @Override
    public double tinhLuong() {
        // TODO Auto-generated method stub
        double luong = wage_time* time;
        return luong;
    }

    @Override
    public String toString() {
        return super.toString() +"time=" + time + ", wage_time=" + wage_time + ", type_staff=" + type_staff + "]";
    }  
}
