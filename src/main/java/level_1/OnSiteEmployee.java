package level_1;

public class OnSiteEmployee extends Employee {
    private static final int PETROL = 140;
    private static final double COFFEE_FEE_PER_HOUR = 0.1;

    public OnSiteEmployee(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public double computeSalary(int hoursWorked) {
        return super.computeSalary((hoursWorked)) + PETROL;
    }

    @Deprecated
    public double computeCoffeeFee(int hoursWorked) {
        return hoursWorked * COFFEE_FEE_PER_HOUR;
    }

}
