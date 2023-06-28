package OOP_Practice_26_6_2023.EX_OOP_26_6_2023.Manage_Shape_2;

public class Main {

    public static void main(String[] args) {
        Shape shape_Circle = new Circle(4);

        shape_Circle.calculateArea();
        shape_Circle.calculatePerimeter();

        Shape shape_Rectangle = new Rectangle(4, 3);
        shape_Rectangle.calculateArea();
        shape_Rectangle.calculatePerimeter();

        Shape shape_Triangle = new Triangle(3, 4, 3, 2);
        shape_Triangle.calculateArea();
        shape_Triangle.calculatePerimeter();
    }   
}
