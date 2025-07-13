//Convert KB into MB
public class Exercise03 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainder = kiloBytes % 1024;
            int megaBytes = Math.round(kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = "
                    + megaBytes
                    + " MB and "
                    + remainder
                    + " KB"); // For example, 2500 KB = 2 MB and 452 KB
        }

    }
}
