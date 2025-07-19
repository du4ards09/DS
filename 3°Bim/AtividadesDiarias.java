package Rosangela;
import java.util.Scanner;
public class AtividadesDiarias {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // inserir o dia da semana
	        System.out.println("Digite o dia da semana: ");
	        String diaSemana = scanner.nextLine().toLowerCase(); // Converte para letra minuscula

	        if (diaSemana.equals("segunda") || diaSemana.equals("terça") 
	        	|| diaSemana.equals("quarta") || diaSemana.equals("quinta") 
	        		|| diaSemana.equals("sexta")) {
	            System.out.println("Dia útil - Trabalhar ou Estudar");
	        } else if (diaSemana.equals("sábado")) {
	            System.out.println("Dia de descanso - Descansar ou fazer atividades de lazer");
	        } else if (diaSemana.equals("domingo")) {
	            System.out.println("Dia de descanso - Descansar ou passar tempo com a família");
	        } else {
	            System.out.println("Dia inválido. Por favor, insira um dia da semana válido.");
	        }

	        scanner.close();
	    }
}



       
