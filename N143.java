import java.util.Scanner;

public class N143 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int k = sca.nextInt();
		int n = sca.nextInt();
		int f = sca.nextInt();

		k = k * n;

		for (int i = 0; i < f; i++) {
			k -= sca.nextInt();
			if (k < 0) {
				System.out.println("-1");
				return;
			}
		}

		System.out.println(k);

	}
}
