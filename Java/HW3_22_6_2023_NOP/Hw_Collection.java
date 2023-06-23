package HW3_22_6_2023_NOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hw_Collection {
    Scanner sc =new Scanner(System.in);
    // 1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.
    public void sum_number(){
        // Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array =  new ArrayList<>();
        System.out.println("Nhap do dai cua ArrayList");
        int length = sc.nextInt();
        for (int i =0 ; i<length; i++){
            System.out.println("Nhap "+i);
            int number = sc.nextInt();
            array.add(number);
        }
        
        int sum = 0;
        for(int number : array) {
            sum += number;
        }
        System.out.println(sum);
    } 

    // 2. Viết một chương trình để tạo một HashSet từ một ArrayList.
    public void createHashSet(){
        // Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Nhap do dai mang:");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<length; i++){
            System.out.println("Nhap "+(i+1));
            String n = sc.nextLine();
            array.add(n);
        }

        HashSet<String> hashSet = new HashSet<>(array);
        System.out.println("hashset: "+hashSet);
    }

    // 3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách.
    public void reverseLinkedList(){
        // Scanner sc = new Scanner(System.in);
        LinkedList<String> lst = new LinkedList<>();
        System.out.println("Nhap do dai danh sach:");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<length; i++){
            System.out.println("Nhap "+(i+1));
            String n = sc.nextLine();
            lst.add(n);
        }

        LinkedList<String> reverse = new LinkedList<>();
        for (String unit: lst){
            reverse.addFirst(unit);
        }

        System.out.println(reverse);
        lst = null;
    }

    // 4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.
    public void maxArrayList(){
        // Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Nhap do dai mang:");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<length; i++){
            System.out.println("Nhap "+(i+1));
            int n = sc.nextInt();
            array.add(n);
        }

        int max_v = array.get(0);
        for(int unit =1 ; unit < length; unit++){
            if (max_v < array.get(unit)){
                max_v = array.get(unit);
            }
        }

        System.out.println("Gia tri lon nhat: "+ max_v);
    }

    // 5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục.
    public void hashMap_student(){
        // Scanner sc = new Scanner(System.in);
        Map <String, Float> studentMap = new HashMap<>();

        System.out.println("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i =1; i<=n; i++){
            System.out.println("Nhap name: ");
            String name = sc.nextLine();
            
            System.out.println("Nhap diem: ");
            Float point = sc.nextFloat();
            sc.nextLine();
            studentMap.put("name", point);
        }

        System.out.println(studentMap);
    }

    // 6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không.
    public void checkContainValue(){
        // Scanner sc =new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Nhap do dai mang:");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<length; i++){
            System.out.println("Nhap "+(i+1));
            String n = sc.nextLine();
            array.add(n);
        }
        sc.nextLine();
        System.out.println("Nhap gia tri can tim:");
        String Value = sc.nextLine();
        boolean contains = array.contains(Value);
        System.out.println("Contain Value? "+contains);
    }

    // 7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái.
    public void sortAlphabet(){
        // Scanner sc =new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Nhap do dai mang:");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<length; i++){
            System.out.println("Nhap "+(i+1));
            String n = sc.nextLine();
            array.add(n);
        }
        
        array.sort(null); // sap xep tang dan
        // for (int i=0; i< length-1;i++){
        //     for(int j =i+1 ; j< length;i++){
        //         if (array.get(i) > array.get(j)){
        //             String temp = array.get(i);
        //             array.set(i, array.get(j));
        //         }
        //     }
        // }
    }

    // 8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần.
    public void treeASC(){
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Nhap do dai mang:");
        int length = sc.nextInt();
        // sc.nextLine();
        for (int i=0; i<length; i++){
            System.out.println("Nhap "+(i+1));
            int n = sc.nextInt();
            array.add(n);
        }

        TreeSet<Object> tree = new TreeSet<>(array);
        // TreeSet<Integer> treereverse = tree.descendingSet();
        TreeSet<Object> tree_res = (TreeSet<Object>)tree.descendingSet();
        System.out.println(tree_res);
    }
   
    // 9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.
    public void BT9() {
        ArrayList<String> numbers = new ArrayList<String>();
        System.out.println("Nhap do dai cua ArrayList: ");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap gia tri cua ArrayList: ");
            String value = sc.nextLine();

            numbers.add(value);
        }
        // System.out.println("array: " + numbers);
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.addAll(numbers);
        System.out.println("ArrayList " + numbers);
        System.out.println("HashSet " + hashSet);
    }

    // 10. Xóa các phần tử trùng lặp từ một ArrayList.
    public void BT10(){
        ArrayList<String> numbers = new ArrayList<String>();
        System.out.println("Nhap do dai cua ArrayList: ");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap gia tri cua ArrayList: ");
            String value = sc.nextLine();

            numbers.add(value);
        }

        ArrayList<String> new_lst = new ArrayList<String>();
        for (String ele : numbers){
            if(!new_lst.contains(ele)){
                new_lst.add(ele);
            }
        }
        System.out.println("ArrayList khong trung lap: "+new_lst);
    }

    // 11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.
    public void BT11(){
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("Nhap do dai cua ArrayList: ");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap gia tri cua ArrayList: ");
            String value = sc.nextLine();

            array.add(value);
        }
        ArrayList<String> new_array = new ArrayList<String>(List.copyOf(array));
        // ArrayList<Integer> copyNumbersArr = new ArrayList<>();
        // System.out.println("Origin copyNumbersArr: " + copyNumbersArr);

        // copyNumbersArr = (ArrayList<Integer>) numbers.clone();
        System.out.println(new_array);
    }

    // 12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.
    public void BT12(){
        String text = "Ai do hay dua toi 50 nghin nhen xin cam on Ai";
        String[] text_new_array = text.split(" ");
        Map<String, Integer> tree = new TreeMap<>();
        
        for (int i=0; i<text_new_array.length; i++){
            if (!tree.containsKey(text_new_array[i])){
                tree.put(text_new_array[i], 1);
            }else{
                int freq = tree.get(text_new_array[i]);
                tree.put(text_new_array[i], freq+1);
            }
        }

        System.out.println(tree);
    }

    // 13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.
    public void BT13(LinkedList<String> linklst, String find_w){
        int count =0;
        for (String s : linklst){
            if (s == find_w){
                count++;
            }
        }
        System.out.println("So lan xuat hien: "+count);
    }

    // 14. Kiểm tra xem một ArrayList có rỗng hay không.
    public void BT14(ArrayList<String> lst){
        System.out.println(lst.isEmpty());
    }

    // 15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.
    public void BT15_add(ArrayList array, int vt, int value){
        array.add(vt, value);
    }

    // 16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.
    public void BT16(ArrayList<Integer> array){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(array);
        for(Integer unit: pq){
            System.out.println("Value follow Priority Queue: "+unit);
        }
    }

    // 17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.
    public void BT17(ArrayList<Integer> array_new, ArrayList<Integer> array_old){
        for (int i =0; i<)
    }
}
