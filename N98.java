import java.util.Scanner;

public class N98 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		double x = sca.nextInt();
		double y = sca.nextInt();

		double A = Math.sqrt(x * x + y * y) * 2;

		System.out.println((int) A + 1);

	}

}
