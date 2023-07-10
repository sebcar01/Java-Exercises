public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score less than 5000"); // true
        } else if (bonus == 800) {
            System.out.println("You have bonus!"); // true
        } else {
            System.out.println("Your score was 5000 or more!");  // false
        }
    }
}
