package SemestrWork;

import java.util.Scanner;

public class SW_Exercise_1_a {
    public static void main (String[] args) {
        Scanner scanner  = new Scanner(System.in);

            double
                    a = scanner.nextDouble(),
                    x = scanner.nextDouble();
            double f = 0;
            f = (1.0 - a) / (1.0 + x*x) * Math.sin(a*a + a*x + 2);

            System.out.println(f);


        }
    }

