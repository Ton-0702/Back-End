public class demo {
    public static void main(String[] args){
        Integer myNumber;
        myNumber = 10;
        System.out.println("myNumber: "+ myNumber);

        Integer myNumber2 = 10;
        System.out.println("myNumber: " + myNumber2);
        myNumber2 = 20; // assign other number

        final int MAX_VALUE = 100; // final là biến hằng số mà giá trị khi ta assign other number thì không thay đổi
        
        System.out.println(MAX_VALUE);

        String numberStr = "123";
        Integer number = Integer.parseInt(numberStr);
        System.out.println("number: " + number);

        int count =1;
        do{
            System.out.println("Count: "+count);
            count++;
        }while(count <1);

        for (int i=1; i<=10; i++){
            if(i==6){
                break;
            }
            System.out.println("i: "+i);
        }

        for(int i=1; i<=5 ; i++){
            if (i==3) {
                continue;
            }
            System.out.println("Iteration: "+i);
        }

        int[] numbers = {3, 9, 4, 7, 2, 6};
        int result = demo.findFirstEvenNumber(numbers);
        System.out.println("First even number: "+result);

        // try {
        //     validateAge(15);
        // }
    }

    public static int findFirstEvenNumber(int[] numbers) {
        for (int num : numbers){
            if (num % 2 == 0){
                return num;
            }
        }
        return -1; //return -1 if no even number is found
    }
}
