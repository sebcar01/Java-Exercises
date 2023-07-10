public class DigitSumChallenge {

    public static void main(String[] args) {
       // System.out.println(sumDigits(1234));
       // numberToWords(123);
        numberToWords(100);
        //System.out.println(reverse(100));
    }

    public static void numberToWords(int number) { // 100

        if (number < 0) {

            System.out.println("Invalid Value");

        }

        int numReversed = reverse(number);

        for (int i = 0; i < getDigitCount(number); i++ ) {

            switch (numReversed % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /= 10;
        }
        System.out.println();
    }

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }


    public static int getDigitCount(int number) {

        if (number < 0) {

            return -1;

        } else {

            int sum = 0;
            while (number > 9) {

                number /= 10;
                sum ++;
            }
            return sum;
        }

    }

//    public static int sumDigits(int number) {
//        int sum = 0;
//        if (number < 0) {
//
//           return -1;
//
//       }
//
//       if (number >= 0 && number <= 9) {
//
//           return number;
//
//       } else {
//
//           while (number != 0) {
//
//               sum += number % 10;
//               number = number / 10;
//
//           }
//
//           return sum;
//       }
//
//    }
}
