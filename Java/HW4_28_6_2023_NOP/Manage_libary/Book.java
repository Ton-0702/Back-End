package HW4_28_6_2023_NOP.Manage_libary;

import java.util.List;

public class Book extends Libary{
    private String name;
    private String author;
    private String date;
    private int quantity;

    public Book(){
        this.name = null;
        this.author = null;
        this.date = null;
        this.quantity = 0;
    }

    public Book(){
        this.name = null;
        this.author = null;
        this.date = null;
    }

    public Book(String name, String author, String date, int quantity) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", date=" + date + ", quantity=" + quantity + "]";
    }
    
}
