package Array.Контрольна_работа_25_10_2017;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

         double e = 0.0001, a = scanner.nextInt(), b = scanner.nextInt(), xss, xs;
         int n = 2;

         xss = a;
         xs = b;

         while (Math.abs(xs - xss) > e) {
             xss = xs;
             xs = xs*xs / (xss + 6);
             n++;
         }
         System.out.println(n);


    }
}
