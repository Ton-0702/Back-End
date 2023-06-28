package HW4_28_6_2023_NOP.Manage_Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nhan vien trong cong ty: ");
        int soNhanvien = sc.nextInt();

        Manage_Staff[] staff = new Manage_Staff[soNhanvien];

        System.out.println("====================Nhap thong tin cho nhan vien====================");
        for(int i =0; i < soNhanvien; i++){
            System.out.println("Nhap thong tin thu "+(i+1)+" :");
            System.out.println("Chon loai nhan vien (1 - Employee, 2 - Manager, 3 - Enginner ): ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    staff[i] = new Employee();
                    staff[i].nhap();
                    break;
                case 2:
                    staff[i] = new Manage();
                    staff[i].nhap();
                    break;
                case 3:
                    staff[i] = new Engineer();
                    staff[i].nhap();
                default:
                    break;
            }
        }

        System.out.println("Thong tin cua cac nhan vien trong cong ty: ");
        for (int i = 0; i < soNhanvien; i++) {
            System.out.println(staff[i].toString());
            Double luongNV1 = staff[i].tinhLuong();
            System.out.println(luongNV1);
        }

    }
}
