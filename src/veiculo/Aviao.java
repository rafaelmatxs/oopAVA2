package veiculo;
import java.util.Scanner;

public class Aviao extends Veiculo {

	private String prefixo, dataRevisao;
	
	public String getPrefixo() {
		return prefixo;
	}
	
	public String getDataRevisao() {
		return dataRevisao;
	}
	
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	
	public void setDataRevisao(String dataRevisao) {
		this.dataRevisao = dataRevisao;
	}
	
	public Aviao() {
		
	}
		
	
	public Aviao(String prefixo) {
		this.prefixo = prefixo;
	}
	public Aviao(String prefixo, String dataRevisao) {
		this.prefixo = prefixo;
		this.dataRevisao = dataRevisao;
	}
	
	public Aviao(double preco) {
		super(preco);
	}
	
	public Aviao(int capacidadeTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
		super.cadastrar(capacidadeTanque, numeroPassageiros, preco);
		setPrefixo(prefixo);
		setDataRevisao(dataRevisao);
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Prefixo: " + getPrefixo());
		System.out.println("Data da revisao: " + getDataRevisao());
	}
	
	@Override
	public void entrada() {
		Scanner scan = new Scanner(System.in);
		
		super.entrada();
		
		System.out.print("Digite o prefixo da Aeronave: ");
		setPrefixo(scan.nextLine());
		System.out.print("Digite a data de revisão: ");
		setDataRevisao(scan.nextLine());
		
		//scan.close();
	}
	
	public void reajustarPreco(double percentual) {
		setPreco(getPreco() + (getPreco() * (percentual/100)));
	}
	
}

	
	
