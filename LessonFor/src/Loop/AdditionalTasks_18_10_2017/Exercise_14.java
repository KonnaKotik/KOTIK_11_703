package AdditionalTasks_18_10_2017;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), k = 0;

        while ( n > 0 )  {
            k ++;
            n /= 10;
        }
        System.out.println(k);

    }
}
