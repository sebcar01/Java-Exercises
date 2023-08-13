import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = "Still working with the company";
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(getBirthDate(), formatter);

        return today.compareTo(birthDate);

    }

    public double collectPay() {

        return 1;

    }

    public void terminate(String endDate) {

        System.out.println("Contract terminated");
        this.endDate = endDate;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
