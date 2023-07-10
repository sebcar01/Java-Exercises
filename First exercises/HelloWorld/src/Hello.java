public class Hello {

    public static void main(String[] args) {
       System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore > 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either of both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Audi";
        boolean isDomestic = (makeOfCar == "Audi") ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic in our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double sumResult = (firstDouble + secondDouble) * 100;
        System.out.println(sumResult);
        double remainderResult = (sumResult % 40.00d);
        System.out.println(remainderResult);
        boolean isRemainder = (remainderResult == 0.00) ? true : false;
        System.out.println(isRemainder);

        if (!isRemainder) {
            System.out.println("Got some reminder");
        }

    }

}
