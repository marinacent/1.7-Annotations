package level_1;

public class Employee {
    public String name;
    public String surname;
    public double hourlyWage;

    public Employee(String name, String surname, double hourlyWage) {
        this.name = name;
        this.surname = surname;
        this.hourlyWage = hourlyWage;
    }

    public double computeSalary(int hoursWorked) {
        return hoursWorked * hourlyWage;
    }
}
