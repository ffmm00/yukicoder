import java.util.Scanner;

public class N203 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		char[] C = (sca.next() + sca.next()).toCharArray();

		int d = 0, max = 0;

		for (int i = 0; i < 14; i++) {
			if (C[i] == ('o')) {
				d++;
				max = Math.max(max, d);
			} else
				d = 0;

		}

		System.out.println(max);

	}

}