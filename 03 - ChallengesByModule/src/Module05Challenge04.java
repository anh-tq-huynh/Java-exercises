//Convert to hours, minutes, seconds from seconds using overloading methods
public class Module05Challenge04 {
    public static void main(String[] args) {
        int seconds = 4045;
        System.out.println(getDurationString(seconds));
    }

    public static String getDurationString (int seconds) {
        if (seconds > 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        } else {
            return "Invalid duration";
        }
    }

    public static String getDurationString (int minutes, int seconds) {
        if (minutes > 0) {
            if (minutes < 60) {
                return "0h " + minutes + "m " + seconds + "s";
            } else {
                return minutes / 60 + "h " + minutes % 60 + "m " + seconds + "s";
            }
        } else {
            return  "Invalid duration";
        }
    }

}
