import java.util.Scanner;

public class N159 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		double p = sca.nextDouble();
		double q = sca.nextDouble();

		double P1 = (1 - p) * q;
		double P2 = p * (1 - q) * q;

		System.out.println((P1 < P2) ? "YES" : "NO");

	}

}
