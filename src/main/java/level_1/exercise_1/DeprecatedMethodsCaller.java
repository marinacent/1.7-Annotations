package level_1.exercise_1;

public class DeprecatedMethodsCaller {

    @SuppressWarnings("deprecation")
    public static void callDeprecatedMethods(OnSiteEmployee onSite, RemoteEmployee remote,
                                             int hoursWorked) {

        System.out.println(onSite.computeCoffeeFee(hoursWorked));
        System.out.println(remote.computeDaysInOffice(hoursWorked));
    }
}
