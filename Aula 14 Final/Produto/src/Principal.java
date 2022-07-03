
public class Principal {
	/*
	 * Polimorfismo é o princípio pelo qual duas ou mais classes 
	 * derivadas de uma mesma superclasse podem invocar métodos
	 * que têm a mesma identificação (assinatura), mas com 
	 * comportamentos distintos. 
	 * Para fazer isso é utilizado uma referência a um objeto do tipo 
	 * da superclass.
	 */
	public static void main(String[] args) {

		Produto prod = new Produto();
		prod.setDescricao("Lote de livros");
		prod.calcularFrete(30);
		System.out.println(prod.getDescricao() + " serão entregues a um custo de R$" + prod.getFrete());
		
		Produto prod2 = new Produto();
		prod2.setDescricao("Lote de cadernos");
		prod2.calcularFrete('L');
		System.out.println(prod2.getDescricao() + " serão entregues a um custo de R$" + prod2.getFrete());

	}

}
