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
            k++;
            t1 *= x;  //домножения делаем не отдельно 
            t2 *= x;
            if (k % 2 == 0) {
                t2 /= k;
                t = t2;
            }
            else {
                t1 /= k;
                t = t1;
            }

            }
            System.out.println(s);
        }


    }

