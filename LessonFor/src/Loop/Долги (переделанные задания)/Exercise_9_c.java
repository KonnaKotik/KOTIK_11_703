package Homework;//-

import java.util.Scanner;

public class Exercise_9_c {
    public static void main(String[] atgs) {
        Scanner scanner = new Scanner(System.in);

        int
                m = 0,
                p = 1,
                n = scanner.nextInt();

        double
                s = 0,
                t = 1;

        while (m <= n) {
            s += p*(2*m -1) / ((2*m + 1)*t);  //неверное тело цикла
            t *= 3.0;
            p = -p;
            m++;
        }
        System.out.println(s);
    }
}
