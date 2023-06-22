package HW_22_6_2023_Hai;
//5. Tạo class Inventory, cung cấp các method put, get, remove, mô tả bài toán được thể hiện ở bên dưới:

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    // String: Tên của sản phẩm (Product.name)
    // List<Product>: Danh sách các sảm phẩm có cùng tên
    HashMap<String, List<String>> products = new HashMap<>();
    
    // void put(Product product);
    // /// Lấy danh sách sản phẩm theo `name`
    // List<Product> get(String name);
    // /// Xóa toàn bộ sản phẩm có trùng `name`
    // boolean remove(String name);
    
    // /// Trả về tổng giá trị hàng hóa của 1 sản phẩm
    // double totalPriceOf(String name);
    // /// Đếm tổng số lượng hàng hóa của 1 sản phẩm
    // int countTotal(String name);
}
