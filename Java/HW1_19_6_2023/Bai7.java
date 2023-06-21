// Tạo 1 method so sánh 2 só nguyên, trả về -1 nếu a<b, trả về 0 nếu a==b và 1 nếu a > b

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        int result = a<b? -1: a==b? 0 : 1;

        System.out.println(result);
    }
}
