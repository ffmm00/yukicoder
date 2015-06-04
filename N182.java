import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N182 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Map<Integer, Integer> vt = new HashMap<Integer, Integer>();

		int n = sca.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sca.nextInt();
			if (vt.containsKey(a))
				vt.put(a, vt.get(a) + 1);
			else
				vt.put(a, 1);
		}

		int C = 0;

		for (Map.Entry<Integer, Integer> voter : vt.entrySet()) {
			int S = voter.getValue();
			if (S == 1)
				C++;
		}

		System.out.println(C);

	}

}
