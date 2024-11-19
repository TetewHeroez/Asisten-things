import java.util.Scanner;

public class Derivative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Derajat tertinggi polinomial: ");
        int n = sc.nextInt();
        n++;
        System.out.print("Koefisien polinomial: ");
        int func[] = new int[n];
        for (int i = 0; i < n; i++) {
            func[i] = sc.nextInt();
        }
        System.out.print("\nf(x)  = ");
        displayfunction(func);
        int[] result = derivative(func);
        System.out.print("\nf'(x) = ");
        displayfunction(result);
    }
    public static int[] derivative(int[] func){
        for (int i = func.length-1; i > 0 ; i--) {
            func[i] = func[i-1] * (func.length-i);
        }
        func[0] = 0;
        return func;
    }
    public static void displayfunction(int[] func){
        boolean isFirstTerm = true;
        boolean hasNonZeroTerm = false;

        for (int i = 0; i < func.length; i++) {
            int coeff = func[i];
            int power = func.length - i - 1;

            if (coeff == 0) {
                continue;
            }

            hasNonZeroTerm = true;

            if (!isFirstTerm && coeff > 0) {
                System.out.print(" + ");
            } else if (coeff < 0) {
                System.out.print(" - ");
                coeff = -coeff; 
            }

            if (coeff != 1 || power == 0) {
                System.out.print(coeff);
            }

            if (power > 0) {
                System.out.print("x");
                if (power > 1) {
                    System.out.print("^" + power);
                }
            }

            isFirstTerm = false;
        }

        if (!hasNonZeroTerm) {
            System.out.print("0");
        }
    }
}