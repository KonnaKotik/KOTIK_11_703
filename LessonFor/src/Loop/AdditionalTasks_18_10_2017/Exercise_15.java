package Loop.AdditionalTasks_18_10_2017;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                m =0, t, a = 1;

        while ( n > 0) {
            t = n % 10;
            if (t % 2 != 0) {
                m = m +t*a;
                a *= 10;
            }
            n /= 10;
        }
        System.out.println(m);
    }
}
