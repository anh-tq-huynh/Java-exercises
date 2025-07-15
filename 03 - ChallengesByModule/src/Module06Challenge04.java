public class Module06Challenge04 {
    public static void main(String[] args) {
        int testNumber = 10;
        int startNumber = 500;
        int primeNumberCounter = 0;
        System.out.println(testNumber + (isPrimeNumber(testNumber) ? " is" : " is not") + " a prime number");

        for (int numberToCheck = startNumber; numberToCheck <= 1000; numberToCheck++) {
            if (primeNumberCounter == 3) {
                break;
            }
            if (isPrimeNumber(numberToCheck)) {
                primeNumberCounter++;
                System.out.println(numberToCheck + " is a prime number");
            }
        }

    }
    public static boolean isPrimeNumber (int number) {
        int counter = 0;
        for (int i = 1; i <= number ; i++) {
            if  (number % i == 0) {
                counter++;
            }
        }
        if (counter <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
