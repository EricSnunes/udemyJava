import java.util.Scanner;

public class CalculoDeSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDoFuncionario, horasTrabalhadas;
		double valorPorHoras,salario;
		
		System.out.println("Insira o numero do funcionario: " );
		numeroDoFuncionario = sc.nextInt();
		System.out.println("Insira as horas trabalhadas : " );
		horasTrabalhadas = sc.nextInt();
		System.out.println("Insira o valor por horas: " );
		valorPorHoras = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHoras;
		System.out.println("numero do funcionario = " + numeroDoFuncionario);
		System.out.println("salario = R$ " + salario);
		
		sc.close();
		
	}
}