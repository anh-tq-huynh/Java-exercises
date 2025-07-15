public class Module06Challenge05 {
    public static void main(String[] args) {
        int sumOfNumbers = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (counter >= 5) {
                break;
            }
            if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " met the requirements");
                sumOfNumbers += i;
                counter++;
            }
        }
        System.out.println(sumOfNumbers + " is the sum of all qualified numbers");
    }

}
