public class GCD_LCM {
  public static int lcm(int c, int d) {
		int a=c;
		int b=d;
		while (c!=d) {
			if (c<d) c+=a;
			if (c>d) d+=b;
		}
		return c;
	}

	public static int gcd(int a, int b) {
		while (a!=b) {
			if (a<b) b-=a;
			if (a>b) a-=b;
		}
		return a;
	}
}
