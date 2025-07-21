package level_1;

public class OnSiteEmployee extends Employee {
    private static int petrol = 140;

    public OnSiteEmployee(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public double computeSalary(int hoursWorked) {
        return super.computeSalary((hoursWorked)) + petrol;
    }

}
