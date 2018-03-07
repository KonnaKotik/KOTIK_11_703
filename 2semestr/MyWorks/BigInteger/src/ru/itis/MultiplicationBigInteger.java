package ru.itis;

import java.util.Scanner;

public class MultiplicationBigInteger {

    public static int[] toInt(String number) {
        char[] charArray = number.toCharArray();
        int[] digits = new int[charArray.length];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = charArray[i] - '0';
        }
        return digits;

    }

    public static int[] multiplicationBigInteger(int[] number_one, int[] number_two){
        int length = number_one.length + number_two.length + 1;
        int[] result = new int[length];
        for (int i = result.length-2; i >=0; i--) {
            for (int j = result.length - 2; j >= 0; j-- ) {
                result[j + 1] += (number_one[i] * number_two[j]) % 10;
                result[j] += (result[i + 1] / 10) + ((number_one[i] * number_two[j]) / 10);
                result[j + 1] = result[i + 1] % 10;
            }

        }
        return result;
    }
    public static String arrayToString(int[] result) {
        String s = "";
        int count = 0;

        if (result[0] == 0) {
            count = 1;
        }

        for (int i = count; i < result.length; i++) {
            s += result[i];
        }
        return s;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number_one = scanner.nextLine();
        String number_two = scanner.nextLine();

        int[] result = multiplicationBigInteger(toInt(number_one), toInt(number_two));

        System.out.println(arrayToString(result));
    }
}
