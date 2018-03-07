package New.String.Homework_December_6;

import java.util.Scanner;

public class Task_52 {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        String
                s1 = scanner.nextLine(),
                s2 = scanner.nextLine();

        boolean f = false;

        int
                p = 0,
                length = s2.length();

        for (int i = 0; i < s1.length(); i++ ) {
            f = false;
           for (int j = p; j < length && !f; j++) {
               if (s1.charAt(i) == s2.charAt(j)) {
                   f = true;
                   p = j + 1;
                   length = p + 1;
               }
           }
           if ((i > 0) && !f) {
               i = 0;
               length = s2.length();
           }
        }

        System.out.println(f);
    }
}
