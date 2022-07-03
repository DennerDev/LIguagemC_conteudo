import java.util.List;

import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {
		Produto3 produtoA = new Produto3();
		produtoA.inserirDados();
		
		Produto3 produtoB = new Produto3();
		produtoB.inserirDados();
		
		Produto3 produtoC = new Produto3();
		produtoC.inserirDados();
		
		CarrinhoCompras3 minhaCompra = new CarrinhoCompras3();
		minhaCompra.adicionar(produtoA);
		minhaCompra.adicionar(produtoB);
		minhaCompra.adicionar(produtoC);
		
		List<Produto3> listaLocal = minhaCompra.gerarLista();
		
		for(Produto3 prod : listaLocal) {
			JOptionPane.showMessageDialog(null, prod.toString());
		}

	}

}
