package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Phone;

import java.util.ArrayList;
import java.util.List;

public class Iphone{
    List<Photo> photos;

    public Iphone(){
        this.photos = new ArrayList<Photo>();
    }

    public Iphone(List<Photo> photos){
        this.photos = photos;
    }

    public List<Photo> getPhotos(){
        return photos;
    }

    public void setPhotos(List<Photo> photos){
        this.photos = photos;
    }

    public void airdrop(Iphone other, String id){
        // System.out.println(((Object) String.valueOf(photos.get(1))).getClass().getName());
        // System.out.println(((Object) id).getClass().getName());
        // System.out.println((String.valueOf(photos.get(1))) == "Cat.jpg");
        System.out.println(photos.size());
        for(int i=0; i < photos.size(); i++){
            if ((String.valueOf(photos.get(i))) == id){
                other.photos.add(photos.get(i));
            }
        }
    }

    public void addPhoto(Photo photo){
        photos.add(photo);
    }

}
