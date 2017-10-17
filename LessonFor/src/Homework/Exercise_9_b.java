package Homework;

import java.util.Scanner;

public class Exercise_9_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = 2;
        double s = 0, t = 1;

        while (m <= n) {
            s += t;
            t *= (double)(m-1)*(m-1) / (2*m*(2*m - 1));
            m++;
        }
        System.out.println(s);
    }
}
