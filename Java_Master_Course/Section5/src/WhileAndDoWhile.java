import java.sql.SQLOutput;

public class WhileAndDoWhile {

    public static void main(String[] args) {
//        int count = 0;
//        while(count != 5){
//            ++count;
//            System.out.println("Count value is " + count);
//        }
//        count = 1;
//        while(true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count!=6);

        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            counter++;
            System.out.println("Even number " + number);
            if(counter == 5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + counter);
    }

    public static boolean isEvenNumber(int myInt){
        return myInt%2==0;
    }



}
