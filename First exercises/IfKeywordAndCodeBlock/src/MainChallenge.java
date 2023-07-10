public class MainChallenge {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 10000, 8, 200);

        System.out.println("Your final score is: " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
        }

        return finalScore;
    }

}
