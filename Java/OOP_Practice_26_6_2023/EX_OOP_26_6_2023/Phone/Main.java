package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Photo photo = new Photo("Cat.jpg");
        Photo photo2 = new Photo("Meow.jpg");
        ArrayList<Photo> photos = new ArrayList<Photo>();
        photos.add(photo);
        Iphone ip1 = new Iphone(photos);
        ip1.addPhoto(photo2);
        System.out.println(ip1);
    }
}
