import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if(fim - inicio < 0) {
			System.out.printf("O JOGO DUROU %d HORA(S)", (24 + fim - inicio));
		} else if (fim - inicio == 0){
			System.out.printf("O JOGO DUROU %d HORA(S)", 24);
		} else {
				System.out.printf("O JOGO DUROU %d HORA(S)", fim - inicio);
		}
		sc.close();
	}

}
