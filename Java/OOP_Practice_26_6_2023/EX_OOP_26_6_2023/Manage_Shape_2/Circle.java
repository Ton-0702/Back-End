package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Manage_Shape_2;

public class Circle extends Shape{
    private final double PI = 3.14;
    private float duongKinh;
    // private float banKinh = duongKinh/2;

    public Circle(float duongKinh){
        this.duongKinh = duongKinh;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        System.out.println("Dien tich hinh tron la: "+ Math.pow((duongKinh/2), 2) * PI);
    }
    @Override
    public void calculatePerimeter() {
        // TODO Auto-generated method stub
        System.out.println("Chu vi hinh tron la: "+ 2 * (duongKinh/2) * PI);
    }


}
