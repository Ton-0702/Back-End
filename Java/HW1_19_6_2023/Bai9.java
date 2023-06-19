// Tạo hàm nhập và 1 số nguyên, in ra tất cả các số chẵn bắt đầu từ 0

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen: ");
        int a = sc.nextInt();

        int check = a/2;
        int i = 0;
        int result = 0;
        while(i<check){
            i+=1;
            result+=2;
            System.out.println("so chan: "+ result);
        }
    }
}
