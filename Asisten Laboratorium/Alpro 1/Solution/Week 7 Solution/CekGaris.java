import java.util.Scanner;

public class CekGaris {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input koefisien untuk garis l1: ax + by + c = 0
        System.out.print("Masukkan koefisien a, b, dan c untuk garis l_1: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Input koefisien untuk garis l2: dx + ey + f = 0
        System.out.print("Masukkan koefisien d, e, dan f untuk garis l_2: ");
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        // Cek apakah garis sejajar
        if (a * e == b * d) {
            cekSejajar(a, b, c, d, e, f);
        } 
        // Cek apakah garis tegak lurus
        else if (cekTegakLurus(a, b, d, e)) {
            System.out.println("Garis-garis tersebut tegak lurus.");
        } 
        // Jika garis tidak sejajar atau tegak lurus, berarti berpotongan
        else {
            System.out.println("Garis-garis tersebut berpotongan.");
            hitungSudut(a, b, d, e);
        }
        scanner.close();
    }

    // Fungsi untuk memeriksa apakah garis sejajar dan jika benar, menghitung jarak
    public static void cekSejajar(double a, double b, double c, double d, double e, double f) {
        if (a * e == b * d) { // Kondisi sejajar
            System.out.println("Garis-garis tersebut sejajar.");
            // Menghitung jarak antara dua garis yang sejajar
            double jarak = Math.abs(c - f) / Math.sqrt(a * a + b * b);
            System.out.printf("Jarak antara kedua garis: %.2f\n", jarak);
        }
    }

    // Fungsi untuk memeriksa apakah garis tegak lurus
    public static boolean cekTegakLurus(double a, double b, double d, double e) {
        return (a * d + b * e) == 0; // Kondisi tegak lurus
    }

    // Fungsi untuk menghitung sudut antara garis-garis yang berpotongan
    public static void hitungSudut(double a, double b, double d, double e) {
        double dotProduct = a * d + b * e;
        double magnitudo1 = Math.sqrt(a * a + b * b);
        double magnitudo2 = Math.sqrt(d * d + e * e);
        double sudut = Math.acos(dotProduct / (magnitudo1 * magnitudo2));
        System.out.printf("Sudut antara kedua garis: %.2f derajat\n", Math.toDegrees(sudut));
    }
}
