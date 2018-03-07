package HomeWorkFor13_12_2017.String;

import java.util.Scanner;

public class Task_235 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String [] array = string.split("[");

        boolean result;

        for (int i = 0; i < string.length(); i++) {
            for (int j = 2; j < array[i].length(); j++) {
                char chj = array[i].charAt(j);
                while (chj != ']') {
                    result = Character.isDigit(chj);
                    if (result == true ) {
                        char min = array[i].charAt(1);
                    }
                }
            }
            System.out.println(array[i]);
        }
    }

}
