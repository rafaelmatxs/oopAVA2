package aplicacao;
import veiculo.*;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao[] avioes = new Aviao[10];
		Navio[] navios = new Navio[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Dados do Aviao #" + (i + 1));
			Aviao aviao = new Aviao();
			aviao.entrada();
			avioes[i] = aviao;
			System.out.println();
			
			System.out.println("Deseja reajustar o preço do Avião #" + (i + 1) + " (sim/nao)");
			
			String resposta = scanner.nextLine();
			
			scanner.nextLine();
			
			if(resposta.equalsIgnoreCase("sim")) {
				System.out.print("Digite o percentual de reajuste do preço: ");
				double percentual = scanner.nextDouble();
				aviao.reajustarPreco(percentual);
				System.out.println("\n---------------------\n");
			}
			
			if (resposta.equalsIgnoreCase("nao")) {
				System.out.println("\n---------------------\n");
			}
		}
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Dados do Navio #" + (i + 1));
			Navio navio = new Navio();
			navio.entrada();
			navios[i] = navio;
			System.out.println();
			
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Dados do Avião #" + (i + 1));
			avioes[i].imprimir();
			System.out.println();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Dados do Navio #" + (i + 1));
			navios[i].imprimir();
			System.out.println("Número de passageiros por tripulantes da embarcação: " + navios[i].passageirosPorTripulantes());
			System.out.println();
		}
		
		scanner.close();
		
	}

}
