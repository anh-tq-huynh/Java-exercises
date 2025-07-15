public class Module05Challenge03 {
    public static void main(String[] args) {
        int footTall = 5;
        int inchTall = 7;
        System.out.println("A person who is " +
                footTall + "foot " + inchTall + "inches " +
                convertToCentimeters(footTall, inchTall) + "cm in height");

    }
    public static double convertToCentimeters (int inch) {
        return inch * 2.54;
    }

    public static double convertToCentimeters (int feet, int inch) {
        int totalInches = (feet * 12) + inch;
        return convertToCentimeters(totalInches);
    }

}
