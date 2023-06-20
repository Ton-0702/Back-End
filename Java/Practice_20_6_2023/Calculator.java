package Practice_20_6_2023;

public class Calculator {
    public void divided(float a, float b){
        if (a == 0 || b==0){
            System.out.println("Can't divide 0");
        }else{
            System.out.println("result: "+a/b);
        }
    }

    public void TakeIndex(String a){
        if (a.length()==0){
            System.out.println("Length is null");
        }
        System.out.println(a.charAt(0));
    }

    // 3. Method kiểm tra 1 số có phải là số chẵn hay không

    public void evenNumber(int a){
        if(a%2==0){
            System.out.println("Is even Number");
        }else{
            System.out.println("Not even");
        }       
    }

    // 4. Method tính tổng 2 kiểu dữ liệu có kiểu short
    public void addShort(short a, short b){
        if ( (a > -32.768 && a< 32.767) && (b > -32.768 && b< 32.767) ){
            System.out.println(a+b);
        }else{
            System.out.println("Input out of range");
        }
        
    }
    // 10. Bài toán vẽ kim tự tháp bằng java?

    public void paramid(int row) {
        for(int i=1; i<=row; i++){
            int k=0;
            for(int j= 1; j<=row-i; j++){
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
        }
    }
}
