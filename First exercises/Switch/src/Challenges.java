public class Challenges {

    public static void main(String[] args) {

        char letter = 'F';

//        switch (letter) {
//
//            case 'A':
//                System.out.println("The NATO word for " + letter + " its Able");
//                break;
//            case 'B':
//                System.out.println("The NATO word for " + letter + " its Baker");
//                break;
//            case 'C':
//                System.out.println("The NATO word for " + letter + " its Charlie");
//                break;
//            case 'D':
//                System.out.println("The NATO word for " + letter + " its Dog");
//                break;
//            case 'E':
//                System.out.println("The NATO word for " + letter + " its Easy");
//                break;
//            default:
//                System.out.println("Not found");
//                break;
//
//        }

//        printDayOfTheWeek(0);
//        printWeekDay(7);
//        System.out.println(printNumberInWord(2));
       System.out.println(isLeapYear(1996));
       System.out.println(getDaysInMonth(2, 1996));


    }

    public static void printDayOfTheWeek(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";

            case 1 -> "Monday";

            case 2 -> "Tuesday";

            case 3 -> "Wednesday";

            case 4 -> "Thursday";

            case 5 -> "Friday";

            case 6 -> "Saturday";

            default -> "Invalid day";
        };

        System.out.println("The value entered was: " + day + " and it corresponds to: " + dayOfTheWeek);

    }

    public static void printWeekDay(int day) {

        String dayOfTheWeek;

        if (day == 0) {

            dayOfTheWeek = "Sunday";

        } else if (day == 1) {

            dayOfTheWeek = "Monday";

        } else if (day == 2) {

            dayOfTheWeek = "Tuesday";

        } else if (day == 3) {

            dayOfTheWeek = "Wednesday";

        } else if (day == 4) {

            dayOfTheWeek = "Thursday";

        } else if (day == 5) {

            dayOfTheWeek = "Friday";

        } else if (day == 6) {

            dayOfTheWeek = "Saturday";

        } else {

            dayOfTheWeek = "Invalid day";

        }

        System.out.println("The value entered was: " + day + " and it corresponds to: " + dayOfTheWeek);

    }

    public static String printNumberInWord(int num) {

        return switch (num) {

            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";

        };

    }

    public static boolean isLeapYear(int year) {

        return ((year % 4 == 0 & year % 100 != 0 || year % 100 == 0 & year % 400 == 0) && (year > 1 && year < 9999)) ;

    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9999 ) {

            return -1;

        }

        switch (month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:

                return 31;

            case 2:

                if (isLeapYear(year)) {

                    return 29;

                } else {

                    return 28;
                }

            case 4: case 6: case 9: case 11:

                return 30;

            default:

                return -1;

        }

    }

}
