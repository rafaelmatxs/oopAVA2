package veiculo;

import java.util.Scanner;

public class Veiculo {
	protected int capacidadeTanque, numeroPassageiros;
	protected double preco;
	
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Veiculo() {
		
	}
	
	public Veiculo(double preco) {
		this.preco = preco;
	}
	
	public Veiculo(int capacidadeTanque, int numeroPassageiros, double preco) {
		this.capacidadeTanque = capacidadeTanque;
		this.numeroPassageiros = numeroPassageiros;
		this.preco = preco;
	}
	
	public void cadastrar(int capacidadeTanque, int numeroPassageiros, double preco) {
		setCapacidadeTanque(capacidadeTanque);
		setNumeroPassageiros(numeroPassageiros);
		setPreco(preco);
	}
	
	
	public void imprimir() {
		System.out.println();
		System.out.println("Capacidade do tanque: " + getCapacidadeTanque());
		System.out.println("Número de passageiros: " + getNumeroPassageiros());
		System.out.println("Preço: " + getPreco());
	}
	
	int indice = 0;
	public void entrada() {
		Scanner scan = new Scanner(System.in);
		
		while(indice == 0) {
			try {
				System.out.print("\nDigite a capacidade do tanque: ");
				setCapacidadeTanque(scan.nextInt());
				indice = 1;
			} catch (Exception e) {
				System.out.print("Valor da capacidade do tanque incorreto! Digite um número inteiro para continuar. " + e + "\n");
				indice = 0;
				entrada();
			}
		}
		
		while(indice == 1) {
			try {
				System.out.print("Digite o número de passageiros: ");
				setNumeroPassageiros(scan.nextInt());
				indice = 2;
			} catch (Exception e) {
				System.out.print("Valor do número de passageiros incorreto! Digite um número inteiro para continuar. " + e + "\n");
				indice = 1;
				entrada();
			}
		}
		
		while(indice == 2) {
			try {
				System.out.print("Digite o preço: ");
				setPreco(scan.nextDouble());
				indice = 3;
			} catch (Exception e) {
				System.out.print("Valor do preço incorreto! Digite um número real ex:'999,99' para prosseguir." + e + "\n");
				indice = 2;
				entrada();
			}
		}
		
		//scan.close();
		
	}
	
}



