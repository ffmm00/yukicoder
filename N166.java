import java.util.Scanner;

public class N166 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		long H = sca.nextLong();
		long W = sca.nextLong();
		long N = sca.nextLong();
		long K = sca.nextLong();

		long M = (H * W) % N;

		if (K == M || (M == 0 && K == N))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
