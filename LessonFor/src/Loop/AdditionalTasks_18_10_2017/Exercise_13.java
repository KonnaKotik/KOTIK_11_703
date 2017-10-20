package Loop.AdditionalTasks_18_10_2017;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
         Scanner scanner  = new Scanner(System.in);

         int
                 n = scanner.nextInt(),
                 p = 1, s = 0, t = 0;

         while ( n > 0 ) {
             t = n % 10;
             s += p*t;
             n /= 10;
             p = -p;
         }
         System.out.println(s);
    }
}
