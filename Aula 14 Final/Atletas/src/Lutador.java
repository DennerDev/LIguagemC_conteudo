
public class Lutador extends Atleta{
	private String estiloLuta;
	public String getEstiloLuta() {
		return estiloLuta;
	}
	public void setEstiloLuta(String estiloLuta) {
		this.estiloLuta = estiloLuta;
	}
	
	@Override
	public void setValorPatrocinio(double valorPatrocinio) {
		// TODO Auto-generated method stub
		super.setValorPatrocinio(valorPatrocinio + 500);
	}
	
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome("Sensei " + nome);
	}
	@Override
	public void atualizarValor(double taxa) {
		// TODO Auto-generated method stub
		
	}
}
