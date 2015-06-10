import java.util.Scanner;

public class N149 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int Aw = sca.nextInt();
		int Ab = sca.nextInt();
		int Bw = sca.nextInt();
		int Bb = sca.nextInt();
		int c = sca.nextInt();
		int d = sca.nextInt();

		if (Ab < c) {
			Aw = Aw - (c - Ab);
			Bw = Bw + (c - Ab);
		}

		if (Bw > d)
			Aw += d;
		else
			Aw += Bw;

		System.out.println(Aw);

	}

}
