import java.util.Scanner;

public class N123 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();
		int m = sca.nextInt();
		int[] f = new int[n];

		for (int i = 0; i < n; i++)
			f[i] = i + 1;

		for (int i = 0; i < m; i++) {
			int a = sca.nextInt() - 1;
			int t = f[a];
			for (int k = a - 1; 0 <= k; k--)
				f[k + 1] = f[k];
			f[0] = t;
		}

		System.out.println(f[0]);

	}

}
