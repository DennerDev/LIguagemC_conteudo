public class Main {

	public static void main(String[] args) {
		Atleta atleta = new Atleta();// Instanciado 
		Corredor corredor = new Corredor();
		Lutador lutador = new Lutador();

		atleta.setValorPatrocinio(1000);
		corredor.setValorPatrocinio(1000);
        lutador.setValorPatrocinio(1000);

		int porcentagemAumento = 15;

		atleta.atualizarValor(porcentagemAumento);
		corredor.atualizarValor(porcentagemAumento);
		lutador.atualizarValor(porcentagemAumento);

        System.out.println("Atleta:   " + atleta.getValorPatrocinio());
        System.out.println("Corredor: " + corredor.getValorPatrocinio());
        System.out.println("Lutador : " + lutador.getValorPatrocinio());
	}

}