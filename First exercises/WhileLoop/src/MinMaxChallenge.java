import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int number;

        System.out.println("Enter numbers and I'll tell you which one is min and max");
        System.out.println("To quit the program enter any character");

        do {

            try {

                System.out.println("Enter the next number: ");
                number = Integer.parseInt(scanner.nextLine());

                if (number > max) {

                    max = number;

                }

                if (number < min) {

                    min = number;

                }

            } catch (NumberFormatException e) {
                System.out.println("You decided to finish the program, bye!");
                break;
            }

            System.out.println("The minimum number is: " + min);
            System.out.println("The maximum number is: " + max);

        } while (true);

    }

}
