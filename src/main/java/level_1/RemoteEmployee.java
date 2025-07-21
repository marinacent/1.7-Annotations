package level_1;

public class RemoteEmployee extends Employee {
    public static final int INTERNET_FLAT_RATE = 40;

    public RemoteEmployee(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public double computeSalary(int hoursWorked) {
        return super.computeSalary(hoursWorked) + INTERNET_FLAT_RATE;
    }

}
