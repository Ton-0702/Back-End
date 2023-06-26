package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.image_4;

public class JPEGImage extends Image implements Filter{
    private String nameImage;
    private String typeImage;
    private int pixel;

    public JPEGImage(String nameImage, String typeImage, int pixel){
        this.nameImage =nameImage;
        this.typeImage =typeImage;
        this.pixel = pixel;
    }


    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name image "+nameImage+" thuoc loai "+typeImage);
    }

    @Override
    public void resize(int n) {
        // TODO Auto-generated method stub
        System.out.println(pixel/n);
    }

    @Override
    public void rotate() {
        // TODO Auto-generated method stub
        System.out.println("Rotate Finish");
    }

    @Override
    public void applyFilter() {
        // TODO Auto-generated method stub
       if (typeImage == "JPEG"){
            display();
       }else{
        System.out.println("Not JPEG");
       }
    }
    
}
