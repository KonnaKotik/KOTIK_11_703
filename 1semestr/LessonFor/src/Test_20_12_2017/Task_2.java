package Test_20_12_2017;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String string = scanner.nextLine();

        String [] array = string.split(" ");
        boolean f = true;

        for(int i = 0; i < (array.length - 1); i++) {
            if (array[i].length() != array[i + 1].length()) {
                f = false;
            }
            for (int j = 0; j > array[i].length() && f; j++) {
                char chj = array[i + 1].charAt(array[i].length()-1);
                char chi = array[i].charAt(j);
                if (chi != chj) {
                    f = false;
                }
            }
            f = true;
        }

            if(f) {
                System.out.println("true");
            }
            else {
                System.out.println("false");

            }
    }
}
