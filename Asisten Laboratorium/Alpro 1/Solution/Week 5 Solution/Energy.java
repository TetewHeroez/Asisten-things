import java.util.Scanner;
public class Energy {
    public static void main(String[] args) {
        double m = 0.171, g = 9.8, h = 50, t, v, Ek, Ep, Em, ht = h;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai perubahan waktu (dalam detik): ");
        double dt = input.nextDouble();
        //System.out.println("------------------------------------------------------------");
        //System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "t", "v", "Ek", "Ep", "Em", "ht");
        //System.out.println("------------------------------------------------------------");
        //for (t = 0; ht > 0; t += dt) {
        //    ht = h - 0.5 * g * t * t;
        //    if (ht < 0) {
        //        ht = 0;
        //        t = Math.sqrt(2 * h / g);
        //    }
        //    v = g * t;
        //    Ek = 0.5 * m * v * v;
        //    Ep = m * g * ht;
        //    Em = Ek + Ep;
        //    System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f%n", t, v, Ek, Ep, Em, ht);
        //}
        //System.out.println("------------------------------------------------------------");
        for (t = 0; ht > 0; t += dt) {
            ht = h - 0.5 * g * t * t;
            if (ht < 0) {
                ht = 0;
                t = Math.sqrt(2 * h / g);
            }
            v = g * t;
            Ek = 0.5 * m * v * v;
            Ep = m * g * ht;
            Em = Ek + Ep;
            System.out.printf("t: %.2f, v: %.2f, Ek: %.2f, Ep: %.2f, Em: %.2f, ht: %.2f%n", t, v, Ek, Ep, Em, ht);
        }
    }
}
