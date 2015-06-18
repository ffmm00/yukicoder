import java.util.Scanner;

public class N104 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		String S = sca.nextLine();
		int A = 1;

		if (S.equals("")) {
			System.out.println(1);
			return;
		}

		char[] b = S.toCharArray();

		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'L')
				A = A * 2;
			else
				A = A * 2 + 1;
		}

		System.out.println(A);

	}
}
