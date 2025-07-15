public class Module06Challenge03 {
    public static void main(String[] args) {
        for (float interest = 7.50F; interest <= 10F; interest += 0.25) {
            float interestAmount = calculateInterest(100,interest);
            System.out.println("Interest of €100 at " + interest + "% interest is €" + interestAmount);
        }
    }
    public static float calculateInterest (int amount, float interestRate) {
        return (amount * (interestRate/100));
    }
}
