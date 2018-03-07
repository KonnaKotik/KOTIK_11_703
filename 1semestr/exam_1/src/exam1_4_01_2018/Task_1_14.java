package exam1_4_01_2018;

import java.util.Scanner;

public class Task_1_14 {
    public static void search(String[] string, int first, int last, String str){

        int
                position = (first + last) / 2;


        while((string[position].equals(str)) && (first <= last)){
            if (string[position].compareTo(str) > 0) {
                last = position - 1;
            }
            else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }

        if(first <= last) {
            System.out.println("Мы нашли строку " + str + " в массиве строк");
        }
        else {
            System.out.println("Строка " + str + " не найдена в массиве строк");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                first = 0,
                last = n - 1;

        System.out.println("Введите строку, которую хотите проверить");
        String str = new String();

        str = scanner.next();

        System.out.println("Введите массив строк");
        String[] string = new String[n];

        for(int i = 0; i < string.length; i++){
            string[i] = scanner.next();
        }

        search(string, first, last, str);
    }
}
