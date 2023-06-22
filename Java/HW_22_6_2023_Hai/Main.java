package HW_22_6_2023_Hai;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectionHash hw = new CollectionHash();
        HashMap <String, String> hashmap = new HashMap<>();
        int length =5;

        //1. Tìm và trả về danh sách các ký tự không trùng nhau trong 1 String. Dùng HashMap để giải bài toán này.
        String bt1_1 = "aaabcc";
        String bt1_2 = "aabbcc";
        
        System.out.println("BT1 hashmap: ");
        hw.BT1(bt1_1);
        hw.BT1(bt1_2);
    }
}
