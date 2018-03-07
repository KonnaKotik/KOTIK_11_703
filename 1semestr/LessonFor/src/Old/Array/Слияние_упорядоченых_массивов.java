package Array;

public class Слияние_упорядоченых_массивов {
    public static void main(String[] args) {

        int[] a = {3, 4, 5, 10, 11, 12, 13};
        int[] b = {1, 2, 6, 7, 8};
        int[] c = new int[a.length + b.length];
        int k, j, l;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");

        k = 0; // пробешет по первому массиву
        j = 0; //пробегает по второму массиву
        l = 0; // пробегате по новому массиву

        while (k < a.length & j < b.length) {
            if (a[k] < b[j]) {
                c[l] = a[k];
                k++;
            } else {
                c[l] = b[j];
                j++;
            }
            l++;
        }
        if (k == a.length)
            for (int i = j; i < b.length; i++) {
                c[l] = b[i];
                i++;
            }
        else
            for (int i = k; i < a.length; i++) {
                c[l] = a[i];
                l++;
            }
        System.out.print(c[l] + " ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

