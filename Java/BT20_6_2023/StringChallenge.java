package BT20_6_2023;

// import java.util.Arrays;

public class StringChallenge {
    //  1. Tìm các chữ cái trùng nhau có trong 1 chuỗi
    public String[] dedupe(String str){
        String[] result = new String[str.length()];  
        int k =0;
        for (int i =0 ; i< str.length() - 1; i++){
            for(int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    result[k] = String.valueOf(str.charAt(i));
                    k++;
                    break;
                }
            }
        }

        
        // for (int i = 0; i<=result.length; i++){
        //     if(result[i].equals(null)){
                
        //     }
        // }

        // String[] result_final = new String[] {result[count]}; 

        return result;

        // cach don gian dung string split
        // String a = "abc";
        // a.split('a', 3)
    }

    // 2. Tìm và trả về ký tự ở vị trí nhập vào
    public char findChar(String str, int vtri){
        char[] chars = str.toCharArray();
        return chars[vtri];
    }

    // 3.Tìm và thay thế {} trong chuỗi
    // function nhieu dau vo goi la overload
    public String replace_v(String str, String param) {
        String[] a = str.split(" ");
        String result = "";
        for (int i =0; i< a.length; i++){
            System.out.println(a[i].equals("{}"));
            if (a[i].equals("{}")){
                a[i] = param; 
            }
            result += a[i] +" ";
        }
        
        return result;
    }

    // 4 Tạo hàm nhận vào không giới hạn 1 danh sách các String, trả về kết quả sau khi nối chuỗi
    // String... strs giup ta ko can khoi tao doi tuong, ta chi can truyen thang
    public String joinStr(String delimiter, String... strs) {
        String joinString = String.join(delimiter, strs);
        return joinString;
    }
}
