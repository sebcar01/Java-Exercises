public class Challenges {

    public static void main(String[] args) {

        //System.out.println(isPrime(568));

//        if (isPrime(2)) {
//
//            for (int counter = 0; counter <= 1000; counter++) {
//
//                if (counter == 3) {
//                    System.out.println(counter);
//                    break;
//                }
//
//            }
//
//        }

        int sum = 0;
        int conditionMet = 0;

        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                sum += i;
                conditionMet++;
                System.out.println(i);

            }

            if (conditionMet == 5) {
                break;
            }

        }

        System.out.println("The total sum of the valid numbers is: " + sum);

    }

//    public static boolean isPrime(int num) {
//
//        if (num <= 2) {
//
//            return (num == 2);
//
//        }
//
//        for (int divisor = 2; divisor <= num / 2; divisor++) {
//
//            if (num % divisor == 0) {
//
//                return false;
//
//            }
//
//        }
//
//        return true;
//
//    }
    
}
