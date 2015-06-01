import java.util.Scanner;

public class N211 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int K = sca.nextInt();
		int[] so = { 2, 3, 5, 7, 11, 13 };
		int[] go = { 4, 6, 8, 9, 10, 12 };
		int c = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (so[i] * go[j] == K)
					c++;
			}
		}

		System.out.println(c / 36.0);
	}

}
