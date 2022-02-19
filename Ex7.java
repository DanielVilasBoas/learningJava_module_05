import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double x, y;
		String quad;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x > 0 && y > 0){
			quad = "Q1";
			System.out.printf(quad);
		} else if (x < 0 && y > 0){
			quad = "Q2";
			System.out.printf(quad);
		} else if (x < 0 && y < 0){
			quad = "Q3";
			System.out.printf(quad);
		} else if (x > 0 && y < 0){
			quad = "Q4";
			System.out.printf(quad);
		}
		sc.close();
	}

}
