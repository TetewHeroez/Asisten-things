public class Matriks2x2 {
  int a, b, c, d;

  // Constructor dengan parameter
  public Matriks2x2(int a, int b, int c, int d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
  }

  // Constructor default (semua elemen 0)
  public Matriks2x2() {
      this(0, 0, 0, 0);
  }

  // Mengalikan matriks ini dengan matriks lain
  public Matriks2x2 multiply(Matriks2x2 m) {
      int newA = this.a * m.a + this.b * m.c;
      int newB = this.a * m.b + this.b * m.d;
      int newC = this.c * m.a + this.d * m.c;
      int newD = this.c * m.b + this.d * m.d;
      return new Matriks2x2(newA, newB, newC, newD);
  }

  // Menghitung trace (jejak)
  public int trace() {
      return a + d;
  }

  // Menghitung determinan
  public int determinan() {
      return a * d - b * c;
  }

  // Menghitung nilai eigen (dalam array double)
  public double[] nilaiEigen() {
      int tr = this.trace();
      int det = this.determinan();
      double diskriminan = tr * tr - 4 * det;

      double realPart = tr / 2.0;
      double imagPart = Math.sqrt(Math.abs(diskriminan)) / 2.0;

      if (diskriminan >= 0) {
          return new double[]{realPart + imagPart, realPart - imagPart};
      } else {
          // Kompleks, disimpan sebagai real ± imajiner (disarankan ubah ke class kompleks bila perlu)
          System.out.println("Nilai eigen kompleks: " +
              realPart + " ± " + imagPart + "i");
          return new double[]{Double.NaN, Double.NaN}; // Placeholder
      }
  }

  // Mencetak matriks
  public void printMatriks() {
      System.out.println("| " + a + " " + b + " |");
      System.out.println("| " + c + " " + d + " |");
  }
}
