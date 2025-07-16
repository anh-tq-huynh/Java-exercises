public class Module06Challenge06 {
    public static void main(String[] args) {
        int startNumber = 5;
        int number = 5;
        int evenCount = 0;
        do {
            if (isEvenNumber(number)) {
                System.out.println(number + " is an even number");
                evenCount++;
            }
            if (evenCount == 5) {
                break;
            }
            number++;
        } while (number <= 20);
        System.out.println("Odd number: " + (number - evenCount - startNumber));
        System.out.println("Even number: " + evenCount);
    }
    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
