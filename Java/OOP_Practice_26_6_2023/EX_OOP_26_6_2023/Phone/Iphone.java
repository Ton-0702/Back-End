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
        for(int i=0; i < other.photos.size(); i++){
            System.out.println("ok");
            if (photos.get(i).equals(id)){
                System.out.println("ok");
                other.photos.add(photos.get(i));
            }
        }
    }

    public void addPhoto(Photo photo){
        photos.add(photo);
    }

}
