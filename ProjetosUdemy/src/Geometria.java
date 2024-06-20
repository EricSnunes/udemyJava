import java.util.Scanner;

public class Geometria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//variaveis
		double A,B,C;
		
		System.out.println("insira o valor A: ");
		A = sc.nextDouble();
		System.out.println("insira o valor B: ");
		B = sc.nextDouble();
		System.out.println("insira o valor C: ");
		C = sc.nextDouble();
	
		//questões a baixo//
		double AreaDoTriangulo = A * C /2;
		System.out.println("a area do triangulo é: " + AreaDoTriangulo);
		
			double AreaDoCirculo = 3.14 * C * C;
			System.out.println("a area do circulo é: " + AreaDoCirculo);
			
			double AreaDoTrapezio = (A + B )* C /2;
			System.out.println("a area do trapezio é: " + AreaDoTrapezio );
			
			double AreaDoQuadrado = 4 * B;
			System.out.println("a area do quadrado é: " + AreaDoQuadrado );
			
			double AreaDoRetangulo = A * B;
			System.out.println("a area do retangulo é: " + AreaDoRetangulo);
			
			
			
			
			
		sc.close();
	}
}