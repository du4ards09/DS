import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		
		// Chamando o Scanner
		Scanner leitura = new Scanner(System.in);
		
		// Declara��o da matriz
		String[][] matriz = new String[3][3];
		
		// La�os pra preencher a matriz 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posi��o [" + i + "][" + j + "]: ");
                String valor = leitura.next();

                // La�o pra verificar se o valor digitado � v�lido (X ou O)
                while (!valor.equalsIgnoreCase("X") && !valor.equalsIgnoreCase("O")) {
                	System.out.println();
                    System.out.println("O valor digitado � inv�lido! Digite X ou O.");
                    System.out.println();
                    System.out.print("Digite o valor da posi��o [" + i + "][" + j + "]: ");
                    valor = leitura.next();
                }

                matriz[i][j] = valor;
            }
        }
        
        System.out.println();
        
        // Exibi��o da matriz
        System.out.println("A matriz do jogo �:");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Verifica��o do resultado do jogo
        
        String vencedor = null; // Declara��o da variavel vencedor
        
        if (matriz[0][0].equalsIgnoreCase(matriz[0][1]) && matriz[0][1].equalsIgnoreCase(matriz[0][2])) {
            vencedor = matriz[0][0];
        } else if (matriz[1][0].equalsIgnoreCase(matriz[1][1]) && matriz[1][1].equalsIgnoreCase(matriz[1][2])) {
            vencedor = matriz[1][0];
        } else if (matriz[2][0].equalsIgnoreCase(matriz[2][1]) && matriz[2][1].equalsIgnoreCase(matriz[2][2])) {
            vencedor = matriz[2][0];
        } else if (matriz[0][0].equalsIgnoreCase(matriz[1][0]) && matriz[1][0].equalsIgnoreCase(matriz[2][0])) {
            vencedor = matriz[0][0];
        } else if (matriz[0][1].equalsIgnoreCase(matriz[1][1]) && matriz[1][1].equalsIgnoreCase(matriz[2][1])) {
            vencedor = matriz[0][1];
        } else if (matriz[0][2].equalsIgnoreCase(matriz[1][2]) && matriz[1][2].equalsIgnoreCase(matriz[2][2])) {
            vencedor = matriz[0][2];
        } else if (matriz[0][0].equalsIgnoreCase(matriz[1][1]) && matriz[1][1].equalsIgnoreCase(matriz[2][2])) {
            vencedor = matriz[0][0];
        } else if (matriz[0][2].equalsIgnoreCase(matriz[1][1]) && matriz[1][1].equalsIgnoreCase(matriz[2][0])) {
            vencedor = matriz[0][2];
        } else {
            vencedor = "VELHA";
        }
        
        System.out.println();
        
        System.out.print("Foi um jogo e tanto! Quem ser� que ganhou? ");
        
        System.out.println();
        System.out.println();
        
        // Exibi��o do resultado do jogo
        if (vencedor.equalsIgnoreCase("X")) {
            System.out.print("O jogador X ganhou!");
        } else if (vencedor.equalsIgnoreCase("O")) {
            System.out.print("O jogador O ganhou!");
        } else {
            System.out.print("Eita! Deu velha...tente novamente.");
        }
        
        leitura.close();

	}
}
