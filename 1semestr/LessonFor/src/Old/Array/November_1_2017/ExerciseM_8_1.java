package Array.November_1_2017;

import java.util.Random;
import java.util.Scanner;

public class ExerciseM_8_1 {
    public static void main(String[] args){

        Random r = new Random();
        Scanner scanner  = new Scanner(System.in);

        int m = scanner.nextInt();
        int [] s = new int[m];
        int [] t = new int[m];
        int [] t1 = new int[m];
        int card = 0, q = 0;

        for(int k = 0; k < m; k++) {
            s[k] = r.nextInt(10);
            System.out.print(s[k] + " ");
        }

        System.out.println(' ');

        for(int k = 0; k < m; k++) {
            t[k] = r.nextInt(10);
            System.out.print(t[k] + " ");
        }

        System.out.println(' ');

        for (int k = 0; k < m; k++){
            q = s[k];
            for ( int i = 0; i < m; i++){
                if (q == t[i]) {
                    t1[k] = 1;
                }
            }
            if (t1[k] == 1) card++;
            System.out.print(t1[k] + " ");
        }

        System.out.println(' ');
        System.out.println(card);
    }
}
