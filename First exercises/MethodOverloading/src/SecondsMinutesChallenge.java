public class SecondsMinutesChallenge {

    public static void main(String[] args) {

       /*// System.out.println(getDurationString(5616));
       // System.out.println(getDurationString(93, 36));
       // printYearsAndDays(561600);

    }

    *//*public static String getDurationString(int seconds) {
        return getDurationString(seconds / 60, seconds % 60) ;
    }*//*

    *//*public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60; // 1
        int finalMinutes;
        int finalSeconds;

        if (minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
            finalMinutes = minutes;
            finalSeconds = seconds;
        } else if (minutes < 0 || seconds < 0) {
            return "Invalid value, must be greater than 0";
        } else {
            finalMinutes = (seconds > 59) ? (minutes % 60) + ((seconds % 60) / 10) : minutes % 60;
            finalSeconds = seconds % 60;
        }

        return hours + "h " + finalMinutes + "m " + finalSeconds + "s.";
    }*//*

//    public static void printYearsAndDays(long minutes) { // Test case 561600 = 1 y and 25 d
//        System.out.println( (minutes < 0) ? "Invalid Value" : minutes + " min = " + ((minutes / 60) / 24) / 365  + " y and " + ((minutes / 60) / 24) % 365 + " d");
//    }
*/


}
