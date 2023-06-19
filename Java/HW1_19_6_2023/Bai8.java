// Tao 1 method nhan vao 1 so nguyen duong, so nay tương ứng với năm (year), 
// trả về 1 nếu số này thuộc về năm nhuận và 0 nếu ngược lại
// gợi ý: năm nhuận là năm chia hết cho 4

import java.util.Scanner;

public class Bai8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong year: ");
        int nguyenduong = sc.nextInt();
        int result = year_nhuan(nguyenduong);
        System.out.println(result);
    }

    public static int year_nhuan(int year_n){
        if (year_n%4==0){
            return 1;
        }
        return 0;
    }

}
