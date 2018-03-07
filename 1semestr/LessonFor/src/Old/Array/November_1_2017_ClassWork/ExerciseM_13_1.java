package Array.November_1_2017_ClassWork;

import java.util.Scanner;

public class ExerciseM_13_1 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] a = {2,2,3,4,4,4,5,5,6,6,6,6,7};
        int k = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < (n - 1); i++) {
            if (a[i] != a[i+1]) k++;
        }
        System.out.println(k+1);
    }
}
