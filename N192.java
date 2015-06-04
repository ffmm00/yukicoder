import java.util.Scanner;

public class N192 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int N = sca.nextInt();

		if (N % 2 == 0)
			System.out.println(N);
		else
			System.out.println(N - 1);

	}
}
