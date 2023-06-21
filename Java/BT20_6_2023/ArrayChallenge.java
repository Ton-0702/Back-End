package BT20_6_2023;

public class ArrayChallenge {
    // 1.Tạo hàm nhận đầu vào là 1 chuỗi các số nguyên, trả ra mảng 2 chiều gồm 2 phần tử
    //  1. Phần tử bên trái là chuỗi bao gồm các số chẵn
    //  2. Phần tử bên phải là chuỗi bao gồm các số lẻ
        public int[][] groupBy(int[] arr) {
            int[][] arr2d = {{},{}};
            
            int v1 = 0;
            int v2 = 0;
            for (int i=0 ;i < arr.length; i++){
                if (arr[i] % 2 ==0){
                    arr2d[0][v1] = arr[i];
                    v1++;
                } else{
                    arr2d[0][v2] = arr[i];
                    v2++;
                }
            }
            return arr2d;
        }
    }
