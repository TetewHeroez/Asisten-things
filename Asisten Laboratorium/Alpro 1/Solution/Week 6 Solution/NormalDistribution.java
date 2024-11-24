import java.util.Scanner;

public class NormalDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai z: ");
        double z = scanner.nextDouble();
        double erf = 0;
        System.out.print("Toleransi error: ");
        double error = scanner.nextDouble();
        int index = 0;

        while (true) {
            double factorial = 1;
            for (int j=index; j>0; j--) {
                factorial = factorial*j;
            }
            double f = Math.pow(-1, index) * Math.pow(z, 2*index+1) / (factorial * (2*index+1)*(Math.pow(2, index)));
            erf += f;
            if (Math.abs(f) < error) {
                break;
            }
            index++;
        }
        double prob = 1/(Math.sqrt(2*Math.PI)) * erf+0.5;
        System.out.println("Diperlukan iterasi sebanyak " + index);
        System.out.println("P( Z <= "+ z +" ) = "+prob);
    } 
}