package level_1;

public class RemoteEmployee extends Employee {
    public static final int INTERNET_FLAT_RATE = 40;
    public static final int HOURS_BEFORE_DAY_IN_OFFICE = 100;

    public RemoteEmployee(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public double computeSalary(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        return super.computeSalary(hoursWorked) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public int computeDaysInOffice(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        return hoursWorked / HOURS_BEFORE_DAY_IN_OFFICE;
    }
}
