import java.util.Scanner;

public class N113 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		char[] d = sca.next().toCharArray();
		double A = 0;
		double x = 0;
		double y = 0;

		for (int i = 0; i < d.length; i++) {
			switch (d[i]) {
			case 'N':
				y++;
				break;
			case 'E':
				x++;
				break;
			case 'W':
				x--;
				break;
			case 'S':
				y--;
				break;
			}
		}

		A = Math.sqrt(x * x + y * y);

		System.out.printf("%.6f", A);

	}

}
