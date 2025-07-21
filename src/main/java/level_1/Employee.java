package level_1;

public class Employee {
    public String name;
    public String surname;
    public double hourlyWage;

    public double computeSalary(int hoursWorked) {
        return hoursWorked * hourlyWage;
    }
}
