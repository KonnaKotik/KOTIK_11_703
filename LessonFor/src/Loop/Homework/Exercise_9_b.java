package Homework;//-

import java.util.Scanner;

public class Exercise_9_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = 2;
        double s = 1, t = 1;

        while (m <= n) {
            t *= (double)(m-1)*(m-1) / (2*m*(2*m - 1));
            s += t;
            //почему переставлены местами? При m=n t сформируется, но в s не попадет
            m++;
        }
        System.out.println(s);
    }
}
