package Array.November_1_2017_ClassWork;

import java.util.Scanner;

public class ExerciseM_22_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean f = true, f1 = true;


        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < (n-1) & (f || f1); i++) {
            if (a[i] <= a[i+1])
                f = false;
            if (a[i] >= a[i+1])
                f1 = false;
        }

        if (f)
            System.out.println("Упорядочены по убыванию");
        else if (f1)
            System.out.println("Упорядочены по возрастанию");
        else
            System.out.println("Не упордочены");
    }
}
