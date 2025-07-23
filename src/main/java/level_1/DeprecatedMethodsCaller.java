package level_1;

public class DeprecatedMethodsCaller {

    @SuppressWarnings("deprecation")
    public static void callDeprecatedMethods(OnSiteEmployee onSite, RemoteEmployee remote,
                                             int hoursWorked) {

        if (onSite != null) {
            System.out.println(onSite.computeCoffeeFee(hoursWorked));
        }

        if (remote != null) {
            System.out.println(remote.computeDaysInOffice(hoursWorked));

        }

    }
}
