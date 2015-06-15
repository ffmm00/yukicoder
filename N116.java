import java.util.Scanner;

public class N116 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();

		int[] a = new int[n];
		int c = 0;

		for (int i = 0; i < n; i++)
			a[i] = sca.nextInt();

		for (int i = 0; i < n - 2; i++) {
			int x = a[i];
			int y = a[i + 1];
			int z = a[i + 2];
			if (x < y && y > z && z != x)
				c++;
			else if (x > y && y < z && x != z)
				c++;
		}

		System.out.println(c);

	}
}
