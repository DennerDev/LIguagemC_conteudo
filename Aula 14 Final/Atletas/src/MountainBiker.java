
public class MountainBiker extends Atleta{

	@Override
	public void atualizarValor(double taxa) {
		this.setValorPatrocinio((this.getValorPatrocinio()*taxa)/100 + this.getValorPatrocinio());
		
	}
	
}
