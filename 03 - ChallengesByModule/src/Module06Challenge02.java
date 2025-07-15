public class Module06Challenge02 {
    public static void main(String[] args) {
        int day = 2;
        printDayOfWeek(day);
        printWeekDay(day);
    }

    public static void printDayOfWeek (int dayNumber) {
        String dayOfTheWeek = switch (dayNumber) {
            case 0 ->  { yield "Sunday";}
            case 1 ->  { yield "Monday";}
            case 2 ->  { yield "Tuesday";}
            case 3 ->  { yield "Wednesday";}
            case 4 ->  { yield "Thursday";}
            case 5 ->  { yield "Friday";}
            case 6 ->  { yield "Saturday";}
            default ->  { yield "Invalid day";}

        };
        System.out.println(dayNumber + " is " + dayOfTheWeek);
    }

    public static void printWeekDay (int dayNumber) {
        String weekDay = "";
        if  (dayNumber == 0) {
            weekDay = "Sunday";
        } else if (dayNumber == 1) {
            weekDay = "Monday";
        } else if (dayNumber == 2) {
            weekDay = "Tuesday";
        } else if (dayNumber == 3) {
            weekDay = "Wednesday";
        }else if (dayNumber == 4) {
            weekDay = "Thursday";
        } else if (dayNumber == 5) {
            weekDay = "Friday";
        } else if (dayNumber == 6) {
            weekDay = "Saturday";
        } else {
            weekDay = "Invalid Day";
        }
        System.out.println(dayNumber + " is " + weekDay);
    }
}
