package level_1.exercise_1;

public class Main {

    public static void main(String[] args) {
        int MONTHLY_HOURS = 160;

        Employee sophia = new Employee("Sophia", "Garcia", 20);
        OnSiteEmployee joan = new OnSiteEmployee("Joan", "Pastor", 20);
        RemoteEmployee irene = new RemoteEmployee("Irene", "Vives", 20);

        System.out.println(sophia.computeSalary(MONTHLY_HOURS));
        System.out.println(joan.computeSalary(MONTHLY_HOURS));
        System.out.println(irene.computeSalary(MONTHLY_HOURS));

        DeprecatedMethodsCaller.callDeprecatedMethods(joan, irene, MONTHLY_HOURS);

    }
}
