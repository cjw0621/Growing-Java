import java.sql.Array;

public class FizzBuzz {

    public static void main(String[] args) {
        int counter = 1;

        do {
            int fizzBuzz = fizzOrBuzz(counter);
            switch (fizzBuzz){
                case -1 -> System.out.println("Fizz ");
                case -2 -> System.out.println("Buzz ");
                case -3 -> System.out.println("FizzBuzz ");
                default -> System.out.println(counter);
            }
            counter+=1;
        }while(counter<=100);


    }
    public static int fizzOrBuzz(int num){
        if((num%3==0)&&(num%5 ==0)){
            return -3;
        } else if (num%5==0){
            return -2;
        }else if(num%3==0){
            return -1;
        }return num;
    }
}
