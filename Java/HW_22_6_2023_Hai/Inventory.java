package HW_22_6_2023_Hai;
//5. Tạo class Inventory, cung cấp các method put, get, remove, mô tả bài toán được thể hiện ở bên dưới:

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Inventory {
    // String: Tên của sản phẩm (Product.name)
    // List<Product>: Danh sách các sảm phẩm có cùng tên
    HashMap<String, List<String>> products = new HashMap<>();
    
    // void put(Product product);
    public void put (String key, List<String> value){
        products.put(key, value);
        System.out.println(products);
    }

    public void get_product(String name) {
        System.out.println(products.get(name));
    }

    // public void remove(String name) {
    //     for (Entry<String, List<String>> entry : products.entrySet()){
    //         String key = entry.getKey();
    //         if (key != )
    //     }
    // }

    // /// Lấy danh sách sản phẩm theo `name`
    // List<Product> get(String name);
    // public List<String> getValue(String name){
    //     return ["1","2"];
    // }
    // /// Xóa toàn bộ sản phẩm có trùng `name`
    // boolean remove(String name);
    
    // /// Trả về tổng giá trị hàng hóa của 1 sản phẩm
    // double totalPriceOf(String name);
    // /// Đếm tổng số lượng hàng hóa của 1 sản phẩm
    // int countTotal(String name);
}
