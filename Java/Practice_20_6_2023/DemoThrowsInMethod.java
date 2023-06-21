package Practice_20_6_2023;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoThrowsInMethod {
    public static void main(String[] args){
        try {
            processFile("example.txt");
            double result = devide(10,0);
            System.out.print("Result: "+result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Da xay ra loi IO: " + e.getMessage());
        }
    }

    public static double devide(double a, double b ){
        try {
            return a/b;
        } catch (Exception e) {
            // TODO: handle exception
            return 0D;
        }
    }

    public static void processFile(String filename) throws IOException{
        Integer devide = 10/0;
        System.out.println(devide);
        // các xử lý khác trên file
        FileReader fileReader;
        fileReader = new FileReader(filename);
        fileReader.close();
    }
}
