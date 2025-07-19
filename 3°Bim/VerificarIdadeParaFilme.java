package Rosangela;
import java.util.Scanner;
public class VerificarIdadeParaFilme {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coloque a idade
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verificar se a pessoa pode assistir ao filme
        if (idade >= 18) {
            System.out.println("Você pode assistir ao filme. Aproveite!");
        }else {
            System.out.println("Desculpe, você não tem idade suficiente para assistir ao filme.");
        }

        // Fecha o scanner
        scanner.close();
    }
}






