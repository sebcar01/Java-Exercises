public class StarChallenge {

    public static void main(String[] args) {

        printSquareStar(4);

    }

    public static void printSquareStar(int number) {

        if (number < 5) {

            System.out.println("Invalid Value");

        } else {

            for (int i = 1; i <= number; i++) { // Row

                if (i == 1 || i == number ) {

                    for (int j = 1; j <= number; j++) {

                        System.out.print("*");

                    }

                    System.out.println();
                } else {

                    for (int k = 1; k <= number ; k++) { // Column

                        if (k == 1 || k == i || k == (number + 1) - i || k == number) {

                            System.out.print("*");

                        } else  {

                            System.out.print(" ");

                        }

                    }

                    System.out.println();

                }

            }

        }

    }

}