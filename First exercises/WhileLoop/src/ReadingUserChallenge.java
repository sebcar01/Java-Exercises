import java.util.Scanner;

public class ReadingUserChallenge {

    public static void main(String[] args) {

        boolean validNumber = false;
        int count = 0;
        int sum = 0;
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        do {

            count++;

            do {

                try {

                    System.out.println("Enter number #" + count);
                    number = Integer.parseInt(scanner.nextLine());
                    validNumber = number > 0;

                    while (number < 1) {

                        System.out.println("Number can't be negative or 0. Try again.");
                        number = Integer.parseInt(scanner.nextLine());
                        validNumber = number > 0;
                    }

                } catch (NumberFormatException e) {

                    System.out.println("Please enter numbers only. Try again.");

                }

            } while (!validNumber);

            sum += number;

        } while (count < 5);

        System.out.println("The sum of the entered numbers is: " + sum);

    }

}
