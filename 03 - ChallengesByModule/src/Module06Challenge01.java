public class Module06Challenge01 {
    public static void main(String[] args) {
        char letter = 'B';
        System.out.println(letter + " in NATO phonetic alphabet is: " + defineNatoLabel(letter));
    }

    public static String defineNatoLabel(char letter) {
        switch (letter) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Not Found";
        }
    }
}
