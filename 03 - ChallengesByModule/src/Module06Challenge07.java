public class Module06Challenge07 {
    public static void main(String[] args) {
        int number = 1200;
        System.out.print(sumDigits(number));

    }
    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }
        if (number <= 9) {
            return number;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
