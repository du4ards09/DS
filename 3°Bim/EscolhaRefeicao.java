package Rosangela;
import java.util.Scanner;
public class EscolhaRefeicao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Escolher entre Café da Manhã, Almoço ou Jantar
        System.out.println("Escolha entre Café da Manhã, Almoço ou Jantar: ");
        String escolha = scanner.nextLine().toLowerCase(); // Converte para minúsculas para facilitar comparações

        // Tomada de decisão encadeada 
        if (escolha.equals("café da manhã")) {
            System.out.println("Recomendação: Pão com manteiga e café");
        }else if (escolha.equals("almoço")) {
            System.out.println("Você prefere Arroz com feijão ou Macarrão com molho de tomate?");
            String escolhaAlmoco = scanner.nextLine().toLowerCase();
            if (escolhaAlmoco.equals("arroz com feijão")) {
                System.out.println("Recomendação: Arroz com feijão");
            }else if (escolhaAlmoco.equals("macarrão com molho de tomate")) {
                System.out.println("Recomendação: Macarrão com molho de tomate");
            }else {
                System.out.println("Escolha inválida.");
            }
        }else if (escolha.equals("jantar")) {
            System.out.println("Recomendação: Frango grelhado com legumes");
        }else {
            System.out.println("Escolha inválida. Por favor, escolha entre Café da Manhã, Almoço ou Jantar.");
        }
        scanner.close();
    }
}




        

