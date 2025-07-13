//Devising A Teen Number Checker For Mastery Of Conditi
public class Exercise08 {
    public static boolean hasTeen (int firstNumber, int secondNumber, int thirdNumber) {
        if ((13 <= firstNumber && firstNumber <= 19) || (13 <= secondNumber && secondNumber <= 19) || (13 <= thirdNumber && thirdNumber <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int testNumber) {
        if (13 <= testNumber && testNumber <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
