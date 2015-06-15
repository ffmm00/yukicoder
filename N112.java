import java.util.Scanner;

public class N112 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int[] a = new int[n];
		int sum = 0;
		int t = 0;
		int k = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sca.nextInt();
			sum += a[i];
		}

		sum /= (n - 1);

		for (int i = 0; i < n; i++) {
			if (sum - a[i] == 2)
				t++;
			else
				k++;
		}

		System.out.println(t + " " + k);

	}

}
