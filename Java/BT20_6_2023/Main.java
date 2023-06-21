package BT20_6_2023;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        StringChallenge str_solve = new StringChallenge();
        String[] new_array_str = str_solve.dedupe("abcdad");
        System.out.println(Arrays.toString(new_array_str));

        // if (new_array_str.length > 0 ){
        //     for(int i =0; i< new_array_str.length; i++){
        //         System.out.println(new_array_str[i]);
        //     }
        // }
        
        // 2.
        char value_index = str_solve.findChar("afdfwq", 4);
        System.out.println("value_index: "+ value_index);

        // 3
        String a = str_solve.replace_v("Local Host Server IP is {}", "127.0.0.1");
        System.out.println(a);

        //4.  Tạo hàm nhận vào không giới hạn 1 danh sách các String, trả về kết quả sau khi nối chuỗi
        String b = str_solve.joinStr("-", "a", "b", "c");
        System.out.println(b);

        // Solve Array 2 dimensions
        ArrayChallenge array_c = new ArrayChallenge();
        int[][] even_odd = array_c.groupBy(new int[] { 1,2,3,4 });
        System.out.println(even_odd);
    }


}
