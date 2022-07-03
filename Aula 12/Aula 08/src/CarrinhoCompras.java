import java.util.List;
import java.util.ArrayList;

public class CarrinhoCompras {
	
	private List<Produto> listProdutos = new ArrayList<Produto>();
	
	public void adicionar(Produto produto) {
		this.listProdutos.add(produto);
	}
	
	public List<Produto> gerarLista(){
		return this.listProdutos;
	}

}
