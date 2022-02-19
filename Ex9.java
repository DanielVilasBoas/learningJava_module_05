import java.util.Locale;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutes = sc.nextInt();
		double valor;

		if (minutes <= 100) {
			valor = 50.00;
		} else {
			valor = (minutes - 100) * 2.00 + 50.00;
		}

		System.out.printf("Valor a pagar: R$ %.2f%n", valor);

		sc.close();
	}

}
