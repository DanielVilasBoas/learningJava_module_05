import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda = sc.nextDouble();
		
		if(renda >= 0.0 && renda <= 2000.00) {
			System.out.println("Isento");
		} else if(renda >= 2000.01 && renda <= 3000.00) {
			System.out.printf("R$ %.2f%n", (renda - 2000) * 0.08);
		} else if(renda >= 3000.01 && renda <= 4500.00) {
			System.out.printf("R$ %.2f%n", (renda - 3000) * 0.18 + 1000 * 0.08);
		} else if(renda > 4500.00) {
			System.out.printf("R$ %.2f%n", (((renda - 4500) * 0.28) + 1500 * 0.18) + 1000 * 0.08);
		}   
		sc.close();
	}

}
