package ru.itis;//-

import java.util.Scanner;

public class Exercise_10_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double
                x = scanner.nextDouble(),
                s = 0,
                t = x, t1 = x, t2 = x;

        int
                n = scanner.nextInt(),
                k = 1;

        while (k <= 2*n) {
            s += t;
            k++; //домножения делаем не отдельно
            if (k % 2 == 0) {
                t2 *= x*x / k;
                t = t2;
            }
            else {
                t1 *= x*x / k;
                t = t1;
            }

            }
            System.out.println(s);
        }


    }

