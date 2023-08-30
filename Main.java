import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(bunnyEars(n));
    }

    private static int bunnyEars(int number) {
        if (number == 0) {
        return 0;
        } else if (number % 2 == 1) {
            return bunnyEars(number-1) + 2;
        } else {
            return bunnyEars(number-1) + 3;
        }
    }
}