import java.util.Scanner;

public class N163 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		char[] S = sca.next().toCharArray();
		for (int i = 0; i < S.length; i++) {
			if ('a' <= S[i] && S[i] <= 'z')
				S[i] = (char) (S[i] - 'a' + 'A');
			else
				S[i] = (char) (S[i] - 'A' + 'a');
		}

		System.out.println(S);

	}

}
