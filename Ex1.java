import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
		} else {
			
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();

	}

}
