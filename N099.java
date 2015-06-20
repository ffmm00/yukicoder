import java.util.Scanner;

public class N099 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int[] a = new int[n];
		int A = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sca.nextInt();
			if (a[i] % 2 == 0)
				A++;
			else
				A--;
		}

		System.out.println(Math.abs(A));

	}

}
