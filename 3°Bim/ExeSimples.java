package Rosangela;
import java.util.Scanner;
public class ExeSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário para inserir três números
		System.out.println("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();

		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		System.out.println("Digite o terceiro número: ");
		double num3 = scanner.nextDouble();

		// Calcula a média dos três números
		double media = calcularMedia(num1, num2, num3);

		// Exibe o resultado
		System.out.println("A média dos três números é: " + media);

		// Fecha o scanner
		scanner.close();
		}

		// Método para calcular a média de três números
		public static double calcularMedia(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
		}
}



     
