public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-5000);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {

            System.out.println("Invalid Value");
        } else {
            int MB = kiloBytes / 1024;
            int RKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB" + " = " + MB + " MB" + " and "
                    + RKB + " KB");
        }
    }


}
