public class Module04MiniChallenge {
    public static void main(String[] args) {
        //variables
        double firstDoubleValue = 20.00D;
        double secondDoubleValue = 80.00D;

        //operators
        double sum = (firstDoubleValue + secondDoubleValue) * 100;
        double remainder = sum % 40.00D;

        //boolean variables
        boolean gotNoRemainder = (remainder == 0.00) ? true : false;
        if (!gotNoRemainder) {
            System.out.println("got some remainder");
        }

    }
}
