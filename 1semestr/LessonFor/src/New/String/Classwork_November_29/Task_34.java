package New.String.Classwork_November_29;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task_34 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String s = scanner.nextLine();
        int
                n = parseInt(s),
                max = 0,
                p;
        while (n > 0) {
            p = n % 10;
            if (p > max) {
                max = p;
            }
            n = n / 10;
        }

        System.out.println(max);
    }
}
