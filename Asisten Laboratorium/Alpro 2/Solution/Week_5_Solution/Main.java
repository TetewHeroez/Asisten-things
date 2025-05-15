public class Main {
  public static void main(String[] args) {
      // Membuat tiga matriks
      Matriks2x2 M1 = new Matriks2x2(1, 2, 3, 4);
      Matriks2x2 M2 = new Matriks2x2(1, -3, 3, -5);
      Matriks2x2 M3 = new Matriks2x2(2, 1, -5, 2);

      // Menampilkan masing-masing matriks
      System.out.println("Matriks M1:");
      M1.printMatriks();
      System.out.println("Trace: " + M1.trace());
      System.out.println("Determinant: " + M1.determinan());
      printEigen(M1);

      System.out.println("\nMatriks M2:");
      M2.printMatriks();
      System.out.println("Trace: " + M2.trace());
      System.out.println("Determinant: " + M2.determinan());
      printEigen(M2);

      System.out.println("\nMatriks M3:");
      M3.printMatriks();
      System.out.println("Trace: " + M3.trace());
      System.out.println("Determinant: " + M3.determinan());
      printEigen(M3);

      // Perkalian antar matriks
      Matriks2x2 M1xM2 = M1.multiply(M2);
      Matriks2x2 M2xM3 = M2.multiply(M3);
      Matriks2x2 M3xM1 = M3.multiply(M1);

      System.out.println("\nM1 x M2:");
      M1xM2.printMatriks();
      System.out.println("Trace: " + M1xM2.trace());
      System.out.println("Determinant: " + M1xM2.determinan());
      printEigen(M1xM2);

      System.out.println("\nM2 x M3:");
      M2xM3.printMatriks();
      System.out.println("Trace: " + M2xM3.trace());
      System.out.println("Determinant: " + M2xM3.determinan());
      printEigen(M2xM3);

      System.out.println("\nM3 x M1:");
      M3xM1.printMatriks();
      System.out.println("Trace: " + M3xM1.trace());
      System.out.println("Determinant: " + M3xM1.determinan());
      printEigen(M3xM1);
  }

  // Helper method untuk mencetak nilai eigen (real)
  public static void printEigen(Matriks2x2 m) {
      double[] eig = m.nilaiEigen();
      if (!Double.isNaN(eig[0])) {
          System.out.printf("Nilai eigen: %.3f, %.3f\n", eig[0], eig[1]);
      }
  }
}
