package HW4_28_6_2023_NOP.Manage_libary;

import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;

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
        System.out.println(book);
        System.out.println(libary_book);
        libary_book.add(book);
    }

    public void addMember(Member member){
        libary_member.add(member);
    }

    public ArrayList<Member> getAllMember(){
        System.out.println("Libary member: "+libary_member);
        return libary_member;
    }

    public void getAMember(int vtri){
        System.out.println("Libary member: "+libary_member.get(vtri));
        // return libary_member;
    }

    public void borrowBook(Member people, ArrayList<Book> books){
        // System.out.println(((Object) member).getClass().getName());
        // System.out.println(((Object) libary_member.get(0)).getClass().getName());
        // System.out.println(member == libary_member.get(1));
        
        for (int member = 0; member < libary_member.size(); member++) {
            if (people == libary_member.get(member)){ // kiểm tra xem có phải là thành viên trong thư viện không
                boolean check_member= true; 
                String peopleName = libary_member.get(member).getMember(); // Lấy tên thành viên trong thư viện
                if (check_member){ // nếu là thành viên trong thư viện thì xét
                    for (int book = 0; book < books.size(); book++) { //duyệt kiểm tra các cuốn sách người xin mượn có trong thư viện không
                        boolean checkBook = false; // cắm cờ cho biết cuốn sách đó có nằm trong thư viện không
                        for (int libary_b = 0; libary_b < libary_book.size(); libary_b++) { // duyệt kiểm tra các cuốn sách trong thư viện
                            String nameBookBorrow = books.get(book).getName();
                            String nameLibaryBook = libary_book.get(libary_b).getName();
                            String authorBookBorrow = books.get(book).getAuthor();
                            String authorLibaryBook = libary_book.get(libary_b).getAuthor();
                            if(nameBookBorrow == nameLibaryBook && authorBookBorrow == authorLibaryBook){ /// nếu cuốn sách mượn có tên sách và tác giả giống tên sách thư viện thì xét
                                checkBook = true; // chuyển lại cắm cờ checkBook ban đầu thành true nếu có cuốn sách trong thư viện
                                if(libary_book.get(libary_b).getQuantity() > 0){ // nếu cuôn sách vẫn còn trong thư viện thì xét
                                    System.out.println("Muon Thanh Cong Sach " + books.get(book).getName() + " boi nguoi muon " + peopleName);
                                    int quantity_book = libary_book.get(libary_b).getQuantity();
                                    libary_book.get(libary_b).setQuantity(quantity_book - 1);
                                    libary_member.get(member).setQuantityBorrowBook(String.valueOf(libary_book.get(libary_b)), 1);
                                }else{ // ngược lại cuốn sách đã không còn trong thư viện
                                    System.out.println("Sach "+ books.get(book) +" da muon het");
                                }
                            }
                        }
                        if(checkBook==false){ // nếu không có sách trong thư viện
                            System.out.println(books.get(book) +" khong co trong thu vien");
                        }
                    }
                }else{
                    System.out.println("Khong phai thanh vien");
                }
            }
        }


    }

}
