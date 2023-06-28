package OOP_Practice_26_6_2023.Practice.Interface;

class Sedan implements Car {
    private String brand;
    
    public Sedan(String brand){
        this.brand = brand;
    }

    @Override
    public void start(){
        System.out.println(brand + " sedan is starting smoothly");
    }

    @Override
    public void stop(){
        System.out.println(brand + " sedan has come to a stop.");
    }

    @Override
    public void drive(double distance){
        System.out.println(brand + " sedan is driving for " + distance + " kilometers.");
    }
}
