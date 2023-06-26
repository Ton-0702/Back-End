package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.image_4;

public class Main {
    public static void main(String[] args) {
        JPEGImage image= new JPEGImage("Tu", "JPEG", 300);
        image.display();
        image.resize(3);
        image.rotate();
        image.applyFilter();

        System.out.println("----------------------------------------------------------");
        JPEGImage image2= new JPEGImage("Toan", "Haha", 200);
        image2.display();
        image2.resize(3);
        image2.rotate();
        image2.applyFilter();

    }
}
