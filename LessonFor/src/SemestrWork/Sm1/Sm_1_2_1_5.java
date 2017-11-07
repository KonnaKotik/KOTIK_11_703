package SemestrWork.Sm1;


public class Sm_1_2_1_5 {
    public static void main(String[] args) {

        int
                m = 8,
                n = 45;

        double [] z = new double[n];
        double [] z1 = new double[n];
        double
                h = 0.9;

        z[0] = 0.75;
        z[1] = -5.35;


        for (int i = 2; i < n; i++) {
            z[i] = Math.sqrt(2 + Math.sin(z[i - 1] + z[i - 2])) + Math.sqrt(2 - Math.cos(z[i - 1] + z[i - 2]));
        }

        for (int j = 0; j < n; j++) {
            z1[j] = (z[j] + 1.5)*(z[j] + 1.5);
            if (z1[j] >= (j - 1)*h && z1[j] < j*h) {
                System.out.println("fi = " + z1[j]);
            }
        }
    }
}
