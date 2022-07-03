import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

/* SOBRESCRITA DE MÉTODO
 * Conceito relacionado a herança.
 * A sobrescrita de métodos consiste basicamente em criar um novo 
 * método na classe filha contendo a mesma assinatura e o mesmo tipo de
 * retorno. Nesses casos alguns comportamentos podem ser diferentes.
 * 1. Criei uma superclasse Funcionário com o método salário
 * 2. Criei um classe filha Gerente e sobrescrevi o método salário
 * 3. Modifiquei o comportamento do método salário sobrescrito na classe
 * filha Gerente. Ex: Adicionei 15% de aumento.
 * */

/* MÉTODOS E CLASSES ABSTRATAS
 * As classes abstratas são as que não permitem realizar qualquer tipo de 
 * instância. Essas classes existem para servir como modelo na criação 
 * de suas classes derivadas.
 * As classes derivadas, por norma, deverão sobrescrever os métodos da
 * classe abstrata para realizar a implementação dos mesmos. Essas classes
 * derivadas são chamadas de classes concretas.
 */


public abstract class Atleta {
	//Criação de atributos
	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	//Get e Set - Métodos acessores
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
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
		this.nome = JOptionPane.showInputDialog("Digite o nome: ");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte: ");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
	}
	
	public abstract void atualizarValor(double taxa);
	
	/*public double atualizarValor(double taxa) {
		this.valorPatrocinio += this.valorPatrocinio * taxa / 100;
		return this.valorPatrocinio;
	}*/
	
	public void mostrar() {
		String mensagem = "Objeto criado a partir da classe";
		mensagem += "\nCódigo: " + this.codigo;
		mensagem += "\nNome: " + this.nome;
		mensagem += "\nEsporte: " + this.esporte;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		mensagem += "\nValor do patrocínio: " + formatar.format(this.valorPatrocinio);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}





