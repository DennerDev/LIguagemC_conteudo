
public class Principal {

	public static void main(String[] args) {
		Atleta objCiclistaMontanha = new MountainBiker();
		objCiclistaMontanha.inserirDados();
		objCiclistaMontanha.atualizarValor(10);
		
		Atleta objCorredor = new Corredor();
		objCorredor.inserirDados();
		objCorredor.atualizarValor(20);
		
		objCiclistaMontanha.mostrar();
		objCorredor.mostrar();
	}

}
