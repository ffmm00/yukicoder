import java.util.Scanner;

public class N218 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		double a = sca.nextDouble();
		double b = sca.nextDouble();
		double c = sca.nextDouble();

		int n = (int) Math.ceil(a / b);
		int k = (int) Math.ceil(a / c);

		if ((n * 2 >= k * 3))
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}