public class Bai3 {
    public static void main(String[] args){
        int int_number = 3;
        long long_number= 8;
        long convert_int_number_to_long = (long) int_number;
        int convert_long_number_to_int = (int) long_number;

        System.out.println("convert int to long: "+Long.valueOf(int_number));
        System.out.println("convert long to int: "+convert_long_number_to_int);
        System.out.println("convert int to int cach khai bao bien: "+convert_int_number_to_long);

        System.out.println("convert int to long: "+((Object)Long.valueOf(int_number)).getClass().getSimpleName());
        System.out.println("convert long to int: "+((Object)convert_long_number_to_int).getClass().getSimpleName());
        System.out.println("convert int to int cach khai bao bien: "+((Object)convert_int_number_to_long).getClass().getSimpleName());
    }
}
