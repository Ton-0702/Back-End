package OOP_Practice_26_6_2023.Practice.Interface;

class SportsCar  implements Car{
    private String brand;
    
    public SportsCar(String brand){
        this.brand = brand;
    }

    @Override
    public void start(){
        System.out.println(brand + " sports car is starting with a roar");
    }
    
    @Override
    public void stop(){
        System.out.println(brand + " sports car has stopped.");       
    }

    @Override
    public void drive(double distance){
        System.out.println(brand + " sports car is driving for " + distance + " kilometer");
    }
}
