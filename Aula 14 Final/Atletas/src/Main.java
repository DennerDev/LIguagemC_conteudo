
public class Main {

	public static void main(String[] args) {
		Corredor corredor = new Corredor();
		Lutador lutador = new Lutador();
		
		corredor.setValorPatrocinio(1000);
		lutador.setValorPatrocinio(1000);
		lutador.setNome("Diego Marque");
		
		int porcentagemAumento = 15;
		
		corredor.atualizarValor(porcentagemAumento);
		lutador.atualizarValor(porcentagemAumento);
		
		System.out.println("Corredor: " + corredor.getValorPatrocinio());
		System.out.println("Lutador: " + lutador.getNome() + " " + lutador.getValorPatrocinio());
		
	}
}
