//Building A Decimal Comparator To Practice Floating-Point Comparisons In Java
public class Exercise06 {
    public static void main(String[] args) {
        double firstNumber = 3.174;
        double secondNumber = 3.175;
        System.out.println("difference: " + (float) Math.abs(firstNumber - secondNumber));
        System.out.printf("result: "+ areEqualByThreeDecimalPlaces(firstNumber,secondNumber));
    }
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        double difference = (float) Math.abs(firstNumber - secondNumber);
        double threshold = 0.001;
        if (difference >= threshold) {
            return false;
        } else {
            return true;
        }
    }
}
