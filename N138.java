import java.util.Scanner;

public class N138 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		String A = sca.next();
		String B = sca.next();

		String[] A2 = A.split("\\.", 0);
		String[] B2 = B.split("\\.", 0);
		boolean C = true;

		for (int i = 0; i < 3; i++) {
			if (Integer.parseInt(A2[i]) < Integer.parseInt(B2[i])) {
				C = false;
				break;
			} else if (Integer.parseInt(A2[i]) > Integer.parseInt(B2[i])) {
				break;
			}
		}

		System.out.println(C ? "YES" : "NO");

	}

}
