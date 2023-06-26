package OOP_Practice_26_6_2023.Practice.Abstract_class;

class SportsCar extends Car {
    private int price;

    public SportsCar(String brand, String color, int price){
        super(brand, color);
        this.price = price;
    }

    @Override
    public void start(){
        System.out.println("Sports car is starting with a roar!");
    }

    @Override
    public void displayInfo(){
        System.out.println("==========Display Info ============");
        super.displayInfo();
        System.out.println("Price: "+price);
    }
}
