package level_1;

public class Main {

    public static void main(String[] args) {
        Employee sophia = new Employee("Sophia", "Garcia", 20);
        OnSiteEmployee joan = new OnSiteEmployee("Joan", "Pastor", 20);
        RemoteEmployee irene = new RemoteEmployee("Irene", "Vives", 20);

        System.out.println(sophia.computeSalary(160));
        System.out.println(joan.computeSalary(160));
        System.out.println(irene.computeSalary(160));

    }
}
