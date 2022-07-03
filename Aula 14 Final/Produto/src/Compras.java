import java.util.List;

import javax.swing.JOptionPane;

public class Compras {

	public static void main(String[] args) {
		Livro livro = new Livro();
		Filme filme = new Filme();
		Caneta caneta = new Caneta();
		Caderno caderno = new Caderno();
		
		JOptionPane.showMessageDialog(null, "INSERIR LIVRO");
		livro.inserirDados();
		JOptionPane.showMessageDialog(null, "INSERIR FILME");
		filme.inserirDados();
		JOptionPane.showMessageDialog(null, "INSERIR CANETA");
		caneta.inserirDados();
		JOptionPane.showMessageDialog(null, "INSERIR CADERNO");
		caderno.inserirDados();
		
		CarrinhoCompras meuCarrinho = new CarrinhoCompras();
		meuCarrinho.adicionar(livro);
		meuCarrinho.adicionar(filme);
		meuCarrinho.adicionar(caneta);
		meuCarrinho.adicionar(caderno);
		
		List<Produto> minhaLista = meuCarrinho.gerarLista();
		
		livro.getPreco();
		
		
		//Frete
		double totalFrete = 0;
		int km = Integer.parseInt(
				JOptionPane.showInputDialog("Distância em KM para entrega"));
		
		for(Produto produto:minhaLista) {
			//totalFrete = totalFrete + produto.calcularFrete(km);
			//System.out.println(produto.toString());
			
			JOptionPane.showMessageDialog(null, produto.toString());
			JOptionPane.showMessageDialog(null, produto.getPreco());
		}
		JOptionPane.showMessageDialog(null, "Total do Frete: " + totalFrete);
		//System.out.println("Total do Frete: " + totalFrete);

	}

}
