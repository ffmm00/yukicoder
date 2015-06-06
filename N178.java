import java.util.Scanner;

public class N178 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();
		long c = 0;
		int[] d = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			int a = sca.nextInt();
			int b = sca.nextInt();
			max = Math.max(max, a + b * 4);
			d[i] = a + 4 * b;
		}

		for (int i = 0; i < n ; i++) {
			if ((max - d[i]) % 2 != 0) {
				System.out.println(-1);
				return;
			} else
				c += (max - d[i]) / 2;
		}

		System.out.println(c);

	}

}
