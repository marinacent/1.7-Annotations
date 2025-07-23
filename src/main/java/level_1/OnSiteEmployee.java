package level_1;

public class OnSiteEmployee extends Employee {
    private static final int PETROL_ALLOWANCE = 140;
    private static final double COFFEE_FEE_PER_HOUR = 0.1;

    public OnSiteEmployee(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public double computeSalary(int hoursWorked) {
        validateHoursWorked(hoursWorked);
        return super.computeSalary(hoursWorked) + PETROL_ALLOWANCE;
    }

    @Deprecated
    public double computeCoffeeFee(int hoursWorked) {
        validateHoursWorked(hoursWorked);
        return hoursWorked * COFFEE_FEE_PER_HOUR;
    }

}
