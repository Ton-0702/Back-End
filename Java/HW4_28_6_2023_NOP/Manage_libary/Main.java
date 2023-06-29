package HW4_28_6_2023_NOP.Manage_libary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(0, new Book("Tieng chim hot", "Dan", "26/6/2023", 30));
        
        ArrayList<Member> members1 = new ArrayList<>();
        members1.add(0, new Member("Dan", "0976419"));

        // Libary libary = new Libary();
        Libary libary = new Libary(books, members1);
        libary.getAllProperties();
        
        // libary.getAllProperties(books, members);
        Book book1 = new Book("Doraemon", "Tu", "19/09/2023", 0);
        Book book2 = new Book("One Piece", "Oda", "13/09/2001", 30);
        
        libary.addBook(book1);
        libary.addBook(book2);
        // System.out.println("ok");
        
        Member member2 = new Member("Hieu", "12341241");
        Member member3 = new Member("VyMap", "113115112");
        libary.addMember(member2);
        libary.addMember(member3);
        libary.getAllMember();

        // Muon sach
        System.out.println();
        System.out.println();
        System.out.println("======================================Check ket qua muon sach=================================");
        Member people3 = new Member("ChoVy", "113113");// Nguoi ngoai khong trong thanh vien thu vien
        ArrayList<Book> borrow_Book = new ArrayList<>();
        
        borrow_Book.add(new Book("Doraemon", "Tu", "19/09/2023"));
        borrow_Book.add(new Book("Bleach", "HaHa", "19/02/2021"));
        borrow_Book.add(new Book("One Piece", "Oda", "13/09/2001"));
        libary.borrowBook(member2, borrow_Book);
        libary.borrowBook(people3, borrow_Book);
        // Ket qua member sau khi muon sach
        System.out.println("======================================Member muon sach=================================");
        libary.getAMember(1);
    }
}
