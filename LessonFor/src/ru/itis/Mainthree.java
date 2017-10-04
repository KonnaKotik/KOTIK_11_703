package ru.itis;

import java.util.Scanner;

public class Mainthree {
        public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);

            int
                    n = scanner.nextInt(),
                    x = scanner.nextInt(),
                    k = 1, one = 1, two = 1;

            double s=0;

            while (k <= n) {
                one *= (2*k-1);
                two *= (2*k);
                s += (double) one*Math.pow((double)x,2*k) / two;
                k++;
            }
            System.out.println(s);

            }
}
