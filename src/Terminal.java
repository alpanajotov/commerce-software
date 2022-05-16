import java.util.Scanner;

public class Terminal {

    public static void output(String outputMessage) {
        System.out.println(outputMessage);
    }

    public static void output(double outputMessage) {
        System.out.println(outputMessage);
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
