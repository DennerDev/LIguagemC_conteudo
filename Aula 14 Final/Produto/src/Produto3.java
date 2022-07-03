import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto3 {
	private int codigo;
	private double preco;
	private String nome;
	private String descricao;
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double calcularFrete(int km) {
		double valor = km * 1.80;
		return valor;
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
		String texto = this.nome + " possui o código " 
		+ this.codigo 
		+ " e custa " 
		+ formatar.format(this.preco);
		return texto;
	}
}
