public class Main {

    public static void main(String[] args) {

        int value = 1;


        switch (value) {
            case 1 -> System.out.println("Your number is 1");
            case 2 -> System.out.println("Your number is 2");
            case 3, 4 , 5 -> {
                System.out.println("Your number is 3, 4 or 5");
                System.out.println("Your number was: " + value);
            }
            default -> System.out.println("Your number is not 1,2,3,4 or 5");

        }

        //System.out.println(getQuarter("1"));

    }

    public static String getQuarter(String value1) {

        return switch (value1) {

            case "January", "February", "March" -> value1 = "First quarter";

            case "April", "May", "June" -> value1 = "Second quarter";

            case "July", "August", "September" -> value1 = "Third quarter";

            case "October", "November", "December" -> value1 = "Fourth quarter";

            default -> {yield "The string doesn't correspond to any month";}

        };

    }

}
