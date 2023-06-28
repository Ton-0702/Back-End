package HW4_28_6_2023_NOP.Manage_libary;

import java.util.HashMap;

public class Member {
    private String name;
    private String phone;
    private HashMap<String, Integer> quantityBorrowBook;
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
        return name + ": " + phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setQuantityBorrowBook(HashMap<String, Integer> quantityBorrowBook) {
        this.quantityBorrowBook = quantityBorrowBook;
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", phone=" + phone + ", quantityBorrowBook=" + quantityBorrowBook + "]";
    }
 
}
