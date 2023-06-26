package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Phone;

import java.util.ArrayList;
import java.util.List;

public class Iphone extends Photo{
    List<Photo> photos = new ArrayList<>();

    public Iphone(ArrayList<Photo> photos){
        this.photos =photos;
    }

    void airdrop(Iphone other, Photo id){
        photos.add(id);
    }
}
