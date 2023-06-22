package HW3_22_6_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hw_Collection hw = new Hw_Collection();
        int choose;
        do{
            System.out.println("--------------------------MENU-------------------------------");
            System.out.println("1. Tao mot ArrayList chua cac so nguyen va tinh tong cua tat ca cac phan tu.");
            System.out.println("2. Viet mot chuong trinh de tao mot HashSet tu mot ArrayList.");
            System.out.println("3. Tao mot linkedlist chua cac chuoi va dao nguoc thu tu cua cac phan tu trong danh sach");
            System.out.println("4. Viet mot phuong thuc de tim phan tu lon nhat trong mot ArrayList.");
            System.out.println("5. Tao mot HashMap chua cac ten va diem so cua sinh vien va in ra tat ca cac muc.");
            System.out.println("6. Viet mot phuong thuc de kiem tra xem mot ArrayList co chua mot gia tri cu the hay khong.");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
            System.out.println("11");
            System.out.println();
            System.out.println("Choose number:");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    hw.sum_number();
                    break;
                case 2:
                    hw.createHashSet();
                    break;
                case 3:
                    hw.reverseLinkedList();
                    break;
                case 4:
                    hw.maxArrayList();
                    break;
                case 5:
                    hw.hashMap_student();
                    break;
                case 6:
                    hw.checkContainValue();
                    break;
                case 7:
                    hw.sortAlphabet();
                    break;
                case 8:
                    hw.treeASC();
                    break;
                case 9:
                    hw.BT9();
                    break;
                case 10:
                    hw.BT10();
                    break;
                case 11:
                    hw.BT11();
                    break;
                case 0:
                    System.out.println("Get out!");
                    break;

                default:
                    break;
            }
        }while(choose != 0);
    }
}
