import java.util.Scanner;
public class QuatroDois {

	public static void main(String[] args) {
		
		// Chamando o Scanner
		Scanner leitura = new Scanner(System.in);
		
		// Declara��o da matriz 
		int matriz[][] = new int [4][2];
		
		//La�os pra preencher a matriz 
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Digite um n�mero:");
				matriz[i][j] = leitura.nextInt();
			}
		}
		
		// Declara��o da vari�vel soma
		int soma;
		
		System.out.println();
		System.out.println();
		
		// Exibi��o da matriz 
		for(int i = 0; i < 4; i++) {
			System.out.println();
			soma = 0;
			for(int j = 0; j < 2; j++) {
				soma = soma  + matriz[i][j]; 
				System.out.print("["+matriz[i][j] + "]");
				}
			
			// Exibi��o da soma da linha
			System.out.println("  O resultado da soma da linha " + i + " � : " + soma);
		}
		leitura.close();

	}

}
