import java.util.Scanner;

public class N207 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		Long A = sca.nextLong();
		Long B = sca.nextLong();

		for (Long i = A; i <= B; i++) {
			String s = Long.toString(i);
			if (i % 3 == 0)
				System.out.println(i);
			else if (s.indexOf('3') >= 0)
				System.out.println(i);

		}

	}
}
