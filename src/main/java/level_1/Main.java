package level_1;

public class Main {

    public static void main(String[] args) {
        int monthlyHours = 160;

        Employee sophia = new Employee("Sophia", "Garcia", 20);
        OnSiteEmployee joan = new OnSiteEmployee("Joan", "Pastor", 20);
        RemoteEmployee irene = new RemoteEmployee("Irene", "Vives", 20);

        try {
            System.out.println(sophia.computeSalary(monthlyHours));
            System.out.println(joan.computeSalary(monthlyHours));
            System.out.println(irene.computeSalary(monthlyHours));

            System.out.println(DeprecatedMethodsCaller.callComputeCoffeeFee(joan, monthlyHours));
            System.out.println(DeprecatedMethodsCaller.callComputeDaysInOffice(irene, monthlyHours));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
