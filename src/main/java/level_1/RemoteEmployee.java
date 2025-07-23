package level_1;

public class RemoteEmployee extends Employee {
    private static final int INTERNET_ALLOWANCE = 40;
    private static final int HOURS_PER_OFFICE_DAY = 100;

    public RemoteEmployee(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public double computeSalary(int hoursWorked) {
        validateHoursWorked(hoursWorked);
        return super.computeSalary(hoursWorked) + INTERNET_ALLOWANCE;
    }

    @Deprecated
    public int computeDaysInOffice(int hoursWorked) {
        validateHoursWorked(hoursWorked);
        return hoursWorked / HOURS_PER_OFFICE_DAY;
    }
}
