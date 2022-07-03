import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CarrinhoCompras3 {
	
	List<Produto3> listProd = new ArrayList<Produto3>();
	
	public void adicionar(Produto3 prod) {
		int km = Integer.parseInt(JOptionPane.showInputDialog("Quantos quilômetros para entrega?"));
		JOptionPane.showMessageDialog(null, "O frete para o produtos " + prod.getNome() + " " + prod.getDescricao() + " é " + prod.calcularFrete(km));
		listProd.add(prod);
	}
	public List<Produto3> gerarLista(){
		return this.listProd;
	}
}
