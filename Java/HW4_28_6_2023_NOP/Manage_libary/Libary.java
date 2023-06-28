package HW4_28_6_2023_NOP.Manage_libary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Libary {
    private ArrayList<Book> libary_book = new ArrayList<>();
    private ArrayList<Member> libary_member = new ArrayList<>();

    public Libary(){
        System.out.println("Contructor....");
        this.libary_book = null;
        this.libary_member = null;
    }

    public Libary(ArrayList<Book> books, ArrayList<Member> members) {
        this.libary_book = books;
        this.libary_member = members;
    }

    public void getAllProperties() {
        System.out.println("this.libary_book: " + this.libary_book);
        System.out.println("this.libary_member: " + this.libary_member);
    }

    public ArrayList<Book> getAllBook(){
        System.out.println("Libary book: "+libary_book);
        return libary_book;
    }

    public void addBook(Book book){
        libary_book.add(book);
    }

    public void addMember(Member member){
        libary_member.add(member);
    }

    public ArrayList<Member> getAllMember(){
        System.out.println("Libary member: "+libary_member);
        return libary_member;
    }

    public void borrowBook(Member people, ArrayList<Book> books){
        // System.out.println(((Object) member).getClass().getName());
        // System.out.println(((Object) libary_member.get(0)).getClass().getName());
        // System.out.println(member == libary_member.get(1));
        
        for (int member = 0; member < libary_member.size(); member++) {
            if (people == libary_member.get(member)){
                boolean check_member= true;
                if (check_member){
                    for (int book = 0; book < books.size(); book++) {
                        for (int libary_b = 0; libary_b < libary_book.size(); libary_b++) {
                            if(books.get(book) == libary_book.get(libary_b)){
                                if(libary_book.get(libary_b).getQuantity() > 0){
                                    int quantity_book = libary_book.get(libary_b).getQuantity();
                                    libary_book.get(libary_b).setQuantity(quantity_book - 1);
                                    libary_member.get(member).setQuantityBorrowBook(put(libary_book.get(libary_b), 1));
                                }else{
                                    System.out.println("Sach "+ books.get(book) +" da muon het");
                                }
                            }else{
                                System.out.println("Sach khong co");
                            }
                        }
                    }
                }else{
                    System.out.println("Khong phai thanh vien");
                }
            }
        }


    }

    private HashMap<String, Integer> put(Book book, int i) {
        return null;
    }
}
