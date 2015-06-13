import java.util.Scanner;

public class N128 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		long n = sca.nextLong();
		long m = sca.nextLong();

		n = (n / 1000) / m;
		System.out.println(n * 1000);

	}

}
