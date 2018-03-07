package Test_20_12_2017;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                count1 = 0,
                count2 = 0,
                count3 = 0,
                sum = 0;

        int array [] = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");

        for(int i = 0; i < array.length; i++) {
            sum = count1 + count2 + count3;
            if (array[i] < 0) {
               int t = array[count1];
                array[count1] = array[i];
                array[i] = t;
                count1++;
            }
            else {
                if (array[i] == 0) {
                    int k = array[count1+count2];
                    array[count1 + count2] = array[i];
                    array[i] = k;
                    count2++;
                }
                else {
                    if(array[i] > 0) {
                        int s = array[sum];
                        array[sum] = array[i];
                        array[i] = s;
                        count3++;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
