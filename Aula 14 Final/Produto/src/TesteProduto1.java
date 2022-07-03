import javax.swing.JOptionPane;

public class TesteProduto1 {

	public static void main(String[] args) {
		Produto2 prod2 = new Produto2();
		prod2.setDescricao(JOptionPane.showInputDialog("Descrição do produto"));
		int km = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância em quilômetros:"));
		prod2.calcularFrete(km);
		System.out.println(prod2.getDescricao() + " serão entregues a um cursto de R$" + prod2.getFrete());

	}

}
