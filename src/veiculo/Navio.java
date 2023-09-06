package veiculo;
import java.util.Scanner;

public class Navio extends Veiculo {
	private String nome, dataLancamento;
	private int numeroTripulantes;
	
	public String getNome() {
		return nome;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}
	
	public void cadastrar(int capacidadeTanque, int numeroPassageiros, double preco, String nome, String dataLancamento, int numeroTripulantes) {
		super.cadastrar(capacidadeTanque, numeroPassageiros, preco);
		setNome(nome);
		setDataLancamento(dataLancamento);
		setNumeroTripulantes(numeroTripulantes);
	}
	
	public Navio() {
		
	}
	
	public Navio(String nome) {
		this.nome = nome;
	}
	
	public Navio(String nome, String dataLancamento) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
	}
	
	public Navio(String nome, String dataLancamento, int numeroTripulantes) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.numeroTripulantes = numeroTripulantes;
	}

	public Navio(String nome, String dataLancamento, int numeroTripulantes, int capacidadeTanque, int numeroPassageiros, double preco) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.numeroTripulantes = numeroTripulantes;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Nome do navio: " + getNome());
		System.out.println("Data lançamento: " + getDataLancamento());
		System.out.println("Numero de tripulantes: " + getNumeroTripulantes());
	}

	@Override
	public void entrada() {
		Scanner scan = new Scanner(System.in);
		
		super.entrada();
		
		while(indice == 3) {
			try {
				System.out.print("Digite o nome: ");
				setNome(scan.nextLine());
				indice = 4;
			} catch (Exception e) {
				System.out.print("Valor nome inválido! " + e + "\n");
				indice = 3;
				entrada();
			}
		}
		
		while(indice == 4) {
			try {
				System.out.print("Digite a data de lançamento: ");
				setDataLancamento(scan.nextLine());
				indice = 5;
			} catch (Exception e) {
				System.out.print("Valor data inválido! " + e + "\n");
				indice = 4;
				entrada();
			}
		}
		
		while(indice == 5) {
			try {
				System.out.print("Digite o número de tripulantes: ");
				setNumeroTripulantes(scan.nextInt());
				
				if(this.getNumeroTripulantes() > 0) {
					indice = 0;
				} else {
					System.out.print("Numero de tripulantes precisa precisa ser maior que 0 (zero) \n");
					indice = 5;
					this.entrada();
				}
				
			} catch (Exception e) {
				System.out.print("Valor de tripulantes inválido! Digite um número inteiro para continuar. " + e + "\n");
				indice = 5;
				this.entrada();
			}
		}
		
		//scan.close();
	}
	
	public double passageirosPorTripulantes() {
		return getNumeroPassageiros()/getNumeroTripulantes();
	}
}
