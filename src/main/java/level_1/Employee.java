package level_1;

public class Employee {
    private String name;
    private String surname;
    private double hourlyWage;

    public Employee(String name, String surname, double hourlyWage) {
        this.name = name;
        this.surname = surname;
        this.hourlyWage = hourlyWage;
    }

    protected static void validateHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
    }

    public double computeSalary(int hoursWorked) {
        validateHoursWorked(hoursWorked);
        return hoursWorked * hourlyWage;
    }
}
