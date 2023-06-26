package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Manage_Shape_2;

public class Triangle extends Shape {
    private float canh1;
    private float canh2;
    private float canhday;
    private float chieuCao;

    public Triangle(float canh1, float canh2, float canhday, float chieuCao){
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canhday = canhday;
        this.chieuCao =chieuCao;
    }
    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        System.out.println("Dien tich hinh tam giac la: "+ (canhday * chieuCao)/2);
    }

    @Override
    public void calculatePerimeter() {
        // TODO Auto-generated method stub
        System.out.println("Chu vi hinh tam giac la: "+ (canh1 + canh2 + canhday));
    }
    
}
