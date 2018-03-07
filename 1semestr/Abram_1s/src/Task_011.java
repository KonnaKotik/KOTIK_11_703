import java.util.Scanner;

public class Task_011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                s = 1;

        if (n%2 == 0) {
            s = 2;
        }

        for (int i = s+2; i <= n; i = i+2) {
            s *= i;
        }

        System.out.println(s);
    }
}
