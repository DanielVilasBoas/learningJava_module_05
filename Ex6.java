import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String intervalo;
		double number;
		
		number = sc.nextDouble();
		
		if(number < 0 || number > 100) {
			System.out.printf("Fora do intervalo");
		} else if(number >= 0 && number <= 25) {
			intervalo = "[0,25]";
			System.out.printf("Intervalo %s%n", intervalo);
		} else if (number > 25 && number <= 50) {
			intervalo = "(25,50]";
			System.out.printf("Intervalo %s%n", intervalo);
		} else if (number > 50 && number <= 75) {
			intervalo = "(50,75]";
			System.out.printf("Intervalo %s%n", intervalo);
		} else if (number > 75 && number <= 100) {
			intervalo = "(75,100]";
			System.out.printf("Intervalo %s%n", intervalo);
		}
		sc.close();
	}
	
}
