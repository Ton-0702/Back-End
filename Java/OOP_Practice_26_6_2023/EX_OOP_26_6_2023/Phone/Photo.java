package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Phone;

class Photo {
    String id;

    public Photo(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Photo " +id;
    }
}
