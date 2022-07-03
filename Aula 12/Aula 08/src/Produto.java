import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto {
	private int codigo;
	private double preco;
	private String nome;
	private String descricao;
	private double frete;
	private DataFabricacao dataFabri;
	
	public DataFabricacao getDataFabri() {
		return dataFabri;
	}
	public void setDataFabri(DataFabricacao dataFabri) {
		this.dataFabri = dataFabri;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double calcularFrete(int km) {
		double valor = km * 1.50;
		return valor;
	}
	
	public void calcularFrete(char regiao) {
		switch(regiao) {
		case 'I': System.out.println("Interior");
			this.frete = 100;
		break;
		case 'M': System.out.println("Metropolitana");
			this.frete = 0;
		break;
		case 'L': System.out.println("Litoral");
			this.frete = 20;
		break;
		default: System.out.println("Insira (I) Interior, (M) Metropolitana ou (L) Litoral");
		break;
		}
	}
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
		this.nome = JOptionPane.showInputDialog("Nome:");
		this.descricao = JOptionPane.showInputDialog("Descrição:");
		this.preco = Double.parseDouble(JOptionPane.showInputDialog("Preço:"));
	}
	
	@Override
	public String toString() {
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		String texto = this.nome + "\n Este produto é um " + this.descricao + 
				", possui o código " + this.codigo + 
				" e custa " + formatar.format(this.preco);
		return texto;
	}

}
