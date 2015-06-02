import java.math.BigInteger;
import java.util.Scanner;

public class N201 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		String S1 = sca.next();
		BigInteger P1 = new BigInteger(sca.next());
		String X1 = sca.next();

		String S2 = sca.next();
		BigInteger P2 = new BigInteger(sca.next());
		String X2 = sca.next();

		if (P1.compareTo(P2) < 0)
			System.out.println(S2);
		else if (P1.compareTo(P2) > 0)
			System.out.println(S1);
		else
			System.out.println(-1);

	}

}
