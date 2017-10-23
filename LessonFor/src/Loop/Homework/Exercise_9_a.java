package Homework;//+

import java.util.Scanner;

public class Exercise_9_a {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        int n = scanner.nextInt(), m = 1, p = 1;
        double s = 0;

        while( m <= n) {
            s += (double)p / (m*m);
            p = -p;
            m++;
        }
        System.out.println(s);
    }
}
