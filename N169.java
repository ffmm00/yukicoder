import java.util.Scanner;

public class N169 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int K = sca.nextInt();
		int S = sca.nextInt();

		int A = (S * 100) / (100 - K);

		System.out.println(A);

	}

}
