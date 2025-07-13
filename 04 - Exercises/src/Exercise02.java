//Convert km/h to mi/h
public class Exercise02 {
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }else {
            return Math.round(kilometersPerHour/1.609);
        }
    }
    public static void printConversion (double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) != -1) {
            System.out.println(kilometersPerHour +
                    " km/h = " +
                    toMilesPerHour(kilometersPerHour) +
                    " mi/h" );
        } else {
            System.out.println("Invalid Value");
        }

    }
}
