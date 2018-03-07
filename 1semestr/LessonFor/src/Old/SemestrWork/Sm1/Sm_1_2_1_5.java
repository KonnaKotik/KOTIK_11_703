package SemestrWork.Sm1; // распределение чисел последовательности


public class Sm_1_2_1_5 {
    public static void main(String[] args) {

        int
                m = 8,
                n = 45;

        int[] fi = new int[m];

        double[] z = new double[n];

        double
                h = 0.9,
                z1 = 0;

        z[0] = 0.75;
        z[1] = -5.35;

        for (int i = 2; i < n; i++) {
            z[i] = Math.sqrt(2 + Math.sin(z[i - 1] + z[i - 2])) + Math.sqrt(2 - Math.cos(z[i - 1] + z[i - 2]));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                z1 = (z[i] + 1.5) * (z[i] + 1.5);
                if ((z1 >= (j - 1) * h) && (z1 < j * h)) {
                    fi[j - 1]++;
                }
            }
        }
        for (int j = 1; j <= m; j++) {
            System.out.print(fi[j - 1] + " ");
        }

    }
}
