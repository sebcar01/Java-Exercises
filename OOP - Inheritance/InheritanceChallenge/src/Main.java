import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee w1 = new SalariedEmployee("John", "01/04/1967", 12344, "02/04/2012", 65500);
        System.out.println(w1.getAge());
        System.out.println(w1.collectPay());
        System.out.println(w1);
        w1.retire();
        System.out.println(w1);

    }

}
