import java.util.Scanner;

public class N185 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int N = sca.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			int X = sca.nextInt();
			int Y = sca.nextInt();
			A[i] = Y - X;
			if (A[i] <= 0) {
				System.out.println(-1);
				return;
			}
		}

		for (int i = 0; i < N - 1; i++) {
			if (A[i] != A[i + 1]) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(A[0]);
	}

}
