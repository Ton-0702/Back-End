package HW_22_6_2023_Hai;

import java.lang.management.ClassLoadingMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CollectionHash {
    //1. Tìm các và trả về danh sách các ký tự không trùng nhau trong 1 String. Dùng HashMap để giải bài toán này.
    public void BT1(String bt1){
        HashMap <String, Integer> hashmap = new HashMap<>();
        for (int i=0; i<bt1.length(); i++){
            // System.out.println(hashmap.containsKey("a"));
            if(!hashmap.containsKey(String.valueOf(bt1.charAt(i)))){
                hashmap.put(String.valueOf(bt1.charAt(i)), 1);
            }else{
                // System.out.println("ok");
                hashmap.put(String.valueOf(bt1.charAt(i)), 2);
            }
        }

        List<String> new_ArrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            if (value ==1){
                new_ArrayList.add(key);
            }
        }
        System.out.println(new_ArrayList);
    }

    //5. Tạo class Inventory, cung cấp các method put, get, remove, mô tả bài toán được thể hiện ở bên dưới:
    
}
