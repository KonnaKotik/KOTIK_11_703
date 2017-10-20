package ru.itis; // Какая задача?

import java.util.Scanner; // Задание № 10(в)

public class Mainthree {
        public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);

            int
                    n = scanner.nextInt(),
                    x = scanner.nextInt(),
                    k = 1;

            double s=0, t = x*x/2;

            while (k <= n) {
                s += t;
                k++;
                t *= (double) x*x*(2*k - 1) / (2*k);
            }
            System.out.println(s);

            }
}
