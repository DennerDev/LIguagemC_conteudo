
public class TesteCompra2 {

	public static void main(String[] args) {
		Filme2 filmeA = new Filme2();
		Produto2 filmeB = new Filme2();
		
		Livro2 livroA = new Livro2();
		Produto2 livroB = new Livro2();
		
		CarrinhoCompras2 meuCarrinho = new CarrinhoCompras2();
		meuCarrinho.adicionar(filmeA);
		meuCarrinho.adicionar(filmeB);
		meuCarrinho.adicionar(livroA);
		meuCarrinho.adicionar(livroB);
	}

}
