public class MethodChallenge {

    public static void main(String[] args) {
        displayHighScorePosition("Chase",
                calculateHighScorePosition(1500));

        displayHighScorePosition("Ben",
                calculateHighScorePosition(900));

        displayHighScorePosition("Emma",
                calculateHighScorePosition(400));

        displayHighScorePosition("Joe",
                calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName,
                                                int position) {

        System.out.println(playerName + " managed to get into position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (PlayerScore >= 1000) {
//            return 1;
//        } else if(PlayerScore >= 500) {
//            return 2;
//        } else if (PlayerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        // This expression creates a variable for the return value so that
        // each if statement doesn't have
        // its own return value. The return value is then expressed
        // at the end of the method.


        int position = 4;
        // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}

