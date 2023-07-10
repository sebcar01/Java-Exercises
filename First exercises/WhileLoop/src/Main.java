public class Main {

    public static void main(String[] args) {

        int number = 5;
        int countEven = 0;
        int odd = 0;
        while (number <= 20) {
            number++;

            if (isEvenNumber(number)) {
                countEven++;
                System.out.println(number);
            } else {
                odd++;
            }

            if (countEven == 5) {
                break;
            }

        }

        System.out.println("The number of even numbers was: " + countEven);
        System.out.println("The number of odd numbers was: " + odd);

    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;

    }

}
