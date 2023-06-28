package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Photo photo = new Photo("Cat.jpg");
        Photo photo2 = new Photo("Meow.jpg");
        List<Photo> photos = new ArrayList<Photo>();
        photos.add(photo);
        Iphone ip1 = new Iphone(photos);
        ip1.addPhoto(photo2);
        
        // in ra các giá trị ảnh photo trong iphone1 
        System.out.println(ip1.getPhotos());

        Iphone ip2 = new Iphone();

        // share ảnh photo qua iphone 2
        ip1.airdrop(ip2, "Meow.jpg");
        
        List<Photo> ip02Photos = ip2.getPhotos();

        for(Photo pt: ip02Photos){
            System.out.println("share anh ip2: "+pt);
        }
    }
}
