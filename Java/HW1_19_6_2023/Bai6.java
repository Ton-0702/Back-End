// cho thang điểm từ 0-100, sinh viên được xếp hạng dựa trên thứ tự như sau
public class Bai6 {
    public static void main(String[] args){
        Bai6.evalute(80); 
    }   
    
    public static void evalute(int score){
        if (score < 20){
            System.out.println("E");
        }else if(score<40){
            System.out.println("D");
        }else if(score<60){
            System.out.println("C");
        }else if(score<80){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
    }
}


