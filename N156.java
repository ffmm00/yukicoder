import java.util.Arrays;
import java.util.Scanner;

public class N156 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();
		int m = sca.nextInt();

		int[] c = new int[n];

		for (int i = 0; i < n; i++)
			c[i] = sca.nextInt();

		Arrays.sort(c);

		int A = 0;

		for (int i = 0; i < n; i++) {
			m -= c[i];
			if (m < 0)
				break;
			A++;
		}

		System.out.println(A);

	}

}
