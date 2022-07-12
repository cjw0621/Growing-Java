import java.util.Scanner;

public class ParseDouble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        double extDbl = toDbl(userInput);

        System.out.println(extDbl);
    }

    public static Double toDbl(String str){
        String stringToStrip = str;
        String stripedValue = (stringToStrip.replaceAll("[\\s+a-zA-Z$,;' :]",
                ""));
        return Double.parseDouble((stripedValue));
    }
}


