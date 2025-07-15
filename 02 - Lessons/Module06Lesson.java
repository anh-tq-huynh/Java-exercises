public class Module06Lesson {
    public static void main(String[] args) {

        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Value was neither 1 nor 2");
        }
        String month = "Dec";
        System.out.println(month + " is in quarter " + getQuarter(month));

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (int rate = 1; rate <= 5; rate++) {
            System.out.println("10,000 at " + rate + "% interest = " + calculateInterest(10_000,rate));
        }

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1";
            case "Apr", "May", "Jun" -> "2";
            case "Jul", "Aug", "Sep" -> "3";
            case "Oct", "Nov", "Dec" -> "4";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
