import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeID, String hireDate, double annualSalary) {
        super(name, birthDate, employeeID, hireDate);
        this.annualSalary = annualSalary;

    }

    public double collectPay() {

        System.out.println("Payment collected successfully");
        return annualSalary;

    }

    public void retire() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate today = LocalDate.now();
        String todayS = today.format(formatter);

        System.out.println("Enjoy retirement!");
        isRetired = true;
        terminate(todayS);

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
