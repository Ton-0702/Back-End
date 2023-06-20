package Practice_20_6_2023;

public class ExceptionHandles {
    public static void main(String[] args){
        try {
            int[] numbers = {1, 2, 3};
            int result = divide(numbers, 0);
            System.out.println("result: "+ result);
        } catch (ArithmeticException ex) {
            // TODO: handle exception
            System.out.println("ArithmeticException: "+ ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException: "+ ex.getMessage());
        } catch (Exception ex){
            System.out.println("Generic Exception: "+ex.getMessage());
        } finally{
            System.out.println("Cleanup code goes here");
        }
    }

    public static int divide(int[] numbers, int divisor){
        int result = 0;
        try {
            result = numbers[0] / divisor;
        } catch (ArithmeticException ex) {
            throw ex; // Rethrow the exception
        } catch (ArrayIndexOutOfBoundsException ex){
            throw ex; // Rethrow the exception
        }
        return result;
    }
}
