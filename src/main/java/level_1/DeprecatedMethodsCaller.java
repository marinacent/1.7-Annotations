package level_1;

public class DeprecatedMethodsCaller {

    @SuppressWarnings("deprecation")
    public static double callComputeCoffeeFee(OnSiteEmployee onSite, int hoursWorked) {
        return (onSite != null) ? onSite.computeCoffeeFee(hoursWorked) : 0.0;
    }

    @SuppressWarnings("deprecation")
    public static int callComputeDaysInOffice(RemoteEmployee remote, int hoursWorked) {
        return (remote != null) ? remote.computeDaysInOffice(hoursWorked) : 0;
    }
}
