import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, qnt;
		
		code = sc.nextInt();
		qnt = sc.nextInt();
		
		if (code == 1) {
			System.out.printf("Total: R$ %.2f%n", qnt * 4.00);
		} else if(code == 2){
			System.out.printf("Total: R$ %.2f%n", qnt * 4.50);
		} else if(code == 3){
			System.out.printf("Total: R$ %.2f%n", qnt * 5.00);
		} else if(code == 4){
			System.out.printf("Total: R$ %.2f%n", qnt * 2.0);
		} else if(code == 5){
			System.out.printf("Total: R$ %.2f%n", qnt * 1.50);
		}
		
		sc.close();

	}
	
}
