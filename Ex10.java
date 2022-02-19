import java.util.Locale;

public class Ex10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double preco = 32.5;
		double desconto = (preco < 20.0) ? preco * 0.10 : preco * 0.05;
		
		System.out.println(desconto);

	}

}
