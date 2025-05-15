public class FiboMatrix {
  public static long[][] multiply(long[][] A, long[][] B) {
		long[][] result = new long[2][2];
		result[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
		result[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
		result[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
		result[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
		return result;
	}

	public static long[][] fibo(int n) {
		long[][] Fibo = {{1,0},{0,1}};
		long[][] F_n = {{1,1},{1,0}};
		for (int i=1; i<=n ; i++)
			Fibo = multiply(F_n,Fibo);
		return Fibo;
    }
    
    public static void printMatrix(long[][] M){
        System.out.print(M[0][0]+" ");
        System.out.println(M[0][1]);
        System.out.print(M[1][0]+" ");
        System.out.println(M[1][1]);
    }
}
