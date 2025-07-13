public class Module4SecondClass {

    public static void main(String[] args) {
        //print 2 lines at the same time
        System.out.println("Hello World");
        System.out.println("Hello Anh");

        //conditional statement if-then
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        //advanced conditional statement
        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.print("Either or both of the conditions are ");
        }

    }
}
