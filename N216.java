import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N216 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		Map<Integer, Integer> test = new HashMap<Integer, Integer>();
		int N = sca.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int score = 0;
		int score2 = 0;

		for (int i = 0; i < N; i++)
			a[i] = sca.nextInt();

		for (int i = 0; i < N; i++)
			b[i] = sca.nextInt();

		for (int i = 0; i < N; i++) {
			if (b[i] == 0)
				score += a[i];
			else if (test.containsKey(b[i]))
				test.put(b[i], test.get(b[i]) + a[i]);
			else
				test.put(b[i], a[i]);
		}

		for (int i : test.values())
			score2 = Math.max(score2, i);

		System.out.println((score >= score2) ? "YES" : "NO");

	}

}