import java.util.Scanner;

public class N175 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int L = sca.nextInt();
		int N = sca.nextInt();
		String S;

		for (int i = 0; i < N; i++)
			S = sca.next();

		L -= 3;

		long A = (long) Math.pow(2, L);

		A *= N;

		System.out.println(A);

	}

}
