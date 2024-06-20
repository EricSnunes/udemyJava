import java.util.Locale;
import java.util.Scanner;

public class lojaDeRoupa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade1, quantidade2;
	    double preco1, preco2, total;

	  
	    System.out.println("quantas camisetas são?");
	    quantidade1 = sc.nextInt();
	    System.out.println("Valor das peças:");
	    preco1 = sc.nextDouble();
	    
	    
	    System.out.println("quantas calças são? ");
	    quantidade2 = sc.nextInt();
	    System.out.println("Valor das peças: ");
	    preco2 = sc.nextDouble();

	    total = preco1 * quantidade1 + preco2 * quantidade2;

	    System.out.printf("VALOR A PAGAR pelas roupas: R$ %.2f%n", total);
		
		sc.close();
	}
}