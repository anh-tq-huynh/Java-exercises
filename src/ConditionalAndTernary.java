public class ConditionalAndTernary {
    public static void main(String[] args) {

        // Test out condition with different data types
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is true");
        }
        else {
            System.out.println("This is false");
        }
        //ternary expression
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true; //check the condition, assign false if the condition is true and vice versa

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        //
    }
}
