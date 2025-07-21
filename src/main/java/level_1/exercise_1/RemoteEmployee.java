package level_1.exercise_1;

public class RemoteEmployee extends Employee {
    public static final int INTERNET_FLAT_RATE = 40;
    public static final int HOURS_FOR_DAY_IN_OFFICE = 100;

    public RemoteEmployee(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public double computeSalary(int hoursWorked) {
        return super.computeSalary(hoursWorked) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public int computeDaysInOffice(int hoursWorked) {
        return hoursWorked / HOURS_FOR_DAY_IN_OFFICE;
    }


}
