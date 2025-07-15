//Combine conditions, the cats are playing if the temperature is within a specified range, the range varies whether summer is true or not
public class Exercise12 {
    public static boolean isCatPlaying (boolean summer, int temperature) {
        int lowerTemp = 25;
        int upperTemp = (summer) ? 45 : 35;

        if (lowerTemp <= temperature && temperature <= upperTemp) {
            return true;
        } else {
            return false;
        }
    }
}
