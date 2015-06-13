import java.util.Arrays;
import java.util.Scanner;

public class N135 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int N = sca.nextInt();
		int[] x = new int[N];
		int A = 0;
		int min = 1000001;

		for (int i = 0; i < N; i++) {
			x[i] = sca.nextInt();
		}

		Arrays.sort(x);

		for (int i = 0; i < N - 1; i++) {
			if (x[i] != x[i + 1]) {
				A = Math.abs(x[i] - x[i + 1]);
				min = Math.min(A, min);
			}
		}

		if (min == 1000001)
			System.out.println(0);
		else
			System.out.println(min);

	}

}
