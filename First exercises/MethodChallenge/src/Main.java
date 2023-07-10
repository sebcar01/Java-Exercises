public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1200);
        displayHighScorePosition("Sebitas", position);
    }

   public static void displayHighScorePosition(String playerName, int playerPosition){
       System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result = 4;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        }
        return result;
    }


}
