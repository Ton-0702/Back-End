package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Manage_Shape_2;

public class Rectangle extends Shape{
    private float chieuDai;
    private float chieuRong;

    public Rectangle(float chieuDai, float chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        System.out.println("Dien tich hinh chu nhat la: "+ chieuDai*chieuRong);
    }

    @Override
    public void calculatePerimeter() {
        // TODO Auto-generated method stub
        System.out.println("Chu vi hinh chu nhat la: "+ (chieuDai+chieuRong)*2);
    }
    
}
