import java.util.Scanner;
public class Hypergeometric
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Data yang diberikan
        int M = 878;   // Jumlah peserta Region Offline 1
        int N = 2290;  // Total peserta

        // Input dari pengguna
        System.out.print("Masukkan jumlah peserta yang diambil (n): ");
        int n = input.nextInt();
        System.out.print("Masukkan jumlah peserta yang diambil dari Region Offline 1 (k): ");
        int k = input.nextInt();

        // Validasi input
        if (!(1 <= k && k <= 20 && k <= n && n <= 60)) {
            System.out.println("Input tidak valid. Pastikan 1 ≤ k ≤ 20 dan k ≤ n ≤ 60.");
            return;
        }

        // Inisialisasi nilai kombinasi
        double kombinasi_M_k = 1;  // untuk menghitung C(M, k)
        double kombinasi_N_M_n_k = 1;  // untuk menghitung C(N-M, n-k)
        double kombinasi_N_n = 1;  // untuk menghitung C(N, n)

        // Menghitung kombinasi C(M, k) = M! / (k!(M-k)!)
        for (int i = 0; i < k; i++) {
            kombinasi_M_k *= (double)(M - i);
            kombinasi_M_k /= (double)(i + 1);
        }

        // Menghitung kombinasi C(N-M, n-k) = (N-M)! / ((n-k)!((N-M)-(n-k))!)
        for (int i = 0; i < (n - k); i++) {
            kombinasi_N_M_n_k *= (double)(N - M - i);
            kombinasi_N_M_n_k /= (double)(i + 1);
        }

        // Menghitung kombinasi C(N, n) = N! / (n!(N-n)!)
        for (int i = 0; i < n; i++) {
            kombinasi_N_n *= (double)(N - i);
            kombinasi_N_n /= (double)(i + 1);
        }

        // Menghitung peluang dengan distribusi hypergeometrik
        double peluang = (double) (kombinasi_M_k * kombinasi_N_M_n_k) / kombinasi_N_n;

        // Output hasil
        System.out.printf("Peluang diambilnya %d peserta dari Region Offline 1 dalam %d peserta yang diambil adalah: %.6f\n", k, n, peluang);
	}
}