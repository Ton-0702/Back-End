package HW_22_6_2023_Hai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectionHash hw = new CollectionHash();
        Inventory hw5 = new Inventory();

        HashMap <String, String> hashmap = new HashMap<>();
        int length =5;

        //1. Tìm và trả về danh sách các ký tự không trùng nhau trong 1 String. Dùng HashMap để giải bài toán này.
        String bt1_1 = "aaabcc";
        String bt1_2 = "aabbcc";
        String bt1_3 = "aaabcdaa";
        
        System.out.println("BT1 hashmap: ");
        hw.BT1(bt1_1);
        hw.BT1(bt1_2);
        hw.BT1(bt1_3);

        System.out.println("BT5 hashmap: ");
        List <String> p = new ArrayList<>();
        p.add("1");
        p.add("2");
        hw5.put("clothes", p);
        hw5.put("jeans", p);
        hw5.put("clothes", p);
        hw5.put("hoho", p);
        hw5.get_product("clothes");
        // System.out.println((hw5));
    }
}
