// convert kiểu dữ liệu string sang char và ngược lại
public class Bai4 {
    public static void main(String[] args){
        String str = "ad ffa";
        char [] arrChar = str.toCharArray();
        System.out.println(arrChar);
        for (char c : arrChar){
            System.out.println(c);
        }

        String result = String.copyValueOf(arrChar);
        String result2 ="";
        for (int i = 0; i<arrChar.length; i++){
            result2 += arrChar[i];
        }

        System.out.println(result);
        System.out.println(result2);
    }
}
