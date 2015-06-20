import java.util.Scanner;

public class N89 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		double c = sca.nextDouble();
		double in = sca.nextDouble();
		double ou = sca.nextDouble();
		double p = Math.PI;

		double V = (p * p * (in + ou) * (ou - in) * (ou - in)) / 4;

		System.out.println(c * V);

	}

}
