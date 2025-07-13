//Define method with boolean condition, if the dog is barking outside the 8-22 timeframe, return true
public class Exercise04 {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        }
    }
    }
