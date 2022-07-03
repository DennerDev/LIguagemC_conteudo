import javax.swing.JOptionPane;

public class Livro extends Produto implements Comercializavel{

	@Override
	public void entregar() {
		String local = JOptionPane.showInputDialog("Qual o endereço de entrega?");
		System.out.println("Entragando o livro em: " + local);
	}

	@Override
	public void receber() {
		String opcao = JOptionPane.showInputDialog("Qual a forma de pagamento?");
		System.out.println("Recenbendo pagamento do livro por: " + opcao);
		
	}

}
