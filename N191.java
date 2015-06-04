import java.util.Scanner;

public class N191 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int N = sca.nextInt();
		int v = 0;
		int M = 0;
		int A = 0;

		int[] C = new int[N];

		for (int i = 0; i < N; i++) {
			C[i] = sca.nextInt();
			M += C[i];
		}

		for (int i = 0; i < N; i++) {
			if (C[i] <= (M / 10))
				A += 30;
		}

		System.out.println(A);

	}
}
