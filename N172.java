import java.util.Scanner;

public class N172 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int x = sca.nextInt();
		int y = sca.nextInt();
		int r = sca.nextInt();

		double D = Math.abs(x) + Math.abs(y) + Math.ceil(r * Math.sqrt(2));

		System.out.println((int)D);

	}

}
