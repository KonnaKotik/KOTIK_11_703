package New.String.Classwork_November_29;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task_35 {

    public static int countnumber(int number){
        int count = 0;
        while (number > 0) {
            count++;
            number/= 10;
        }
        return(count);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String [] strs  = s.split(" ");

        int
                n,
                min,
                minnumber;

        n = parseInt(strs[0]);
        min = countnumber(n);

        for (int i = 1; i < strs.length; i++) {
            n = parseInt(strs[i]);
            int p = countnumber(n);
            if (p <= min) {
                min = p;
                minnumber = n;

            }
        }

        System.out.println(n);
    }
}
