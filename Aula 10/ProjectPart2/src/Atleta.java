import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

/* ENCAPSULAMENTO
 * Encapsular os dados de uma aplicaÃ§Ã£o significa evitar 
 * que estes sofram acessos indevidos.
 * 
 * Public: significa visibilidade total.
 * 
 * Private: O elemento tem a sua visibilidade restrita 
 * a classe que ele estÃ¡.
 * 
 * Protected: Permite que os atributos ou mÃ©todos sejam
 * visualizados na prÃ³pria classe e nas classes filhas (heranÃ§a)
 * 
 * Conceitos de sobreecreta de metodos e assinatura.
 * */
public class Atleta {
	//CriaÃ§Ã£o de atributos
	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	//Get e Set - MÃ©todos acessores
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEsporte() {
		return this.esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	
	public double getValorPatrocinio() {
		return this.valorPatrocinio;
	}
	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o cÃ³digo:"));
		this.nome = JOptionPane.showInputDialog("Digite o nome: ");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte: ");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
	}
	
	public double atualizarValor(double taxa) {
		this.valorPatrocinio += this.valorPatrocinio * taxa / 100;
		return this.valorPatrocinio;
	}
	
	public void mostrar() {
		String mensagem = "Objeto criado a partir da classe";
		mensagem += "\nCÃ³digo: " + this.codigo;
		mensagem += "\nNome: " + this.nome;
		mensagem += "\nEsporte: " + this.esporte;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		mensagem += "\nValor do patrocÃ­nio: " + formatar.format(this.valorPatrocinio);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}




