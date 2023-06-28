package HW4_28_6_2023_NOP.Manage_libary;

import java.util.HashMap;

public class Member {
    private String name;
    private String phone;
    private HashMap<String, Integer> quantityBorrowBook; //chứa sách đã mượn và số lượng mượn là bao nhiêu
    public Member(){
        this.name = null;
        this.phone =null;
        this.quantityBorrowBook = new HashMap<>();
    }

    public Member(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.quantityBorrowBook= new HashMap<>();
    }

    public String getMember() {
        return name + "co sdt la " + phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setQuantityBorrowBook(String nameBook, int quantity) {
        this.quantityBorrowBook.put(nameBook, quantity);
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", phone=" + phone + ", quantityBorrowBook=" + quantityBorrowBook + "]";
    }
 
}
