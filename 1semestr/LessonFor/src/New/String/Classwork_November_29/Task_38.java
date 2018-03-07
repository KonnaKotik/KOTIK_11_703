package New.String.Classwork_November_29;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task_38 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int
                n = parseInt(s),
                p;

        boolean f = false;

        while (n > 0 && !f) {
            p = n % 10;
            if ( (p % 2 == 0) || (p % 3 == 0)) {
                f = true;
            }
            n /= 10;
        }

        System.out.println(f);

        }
}
