
public class Corredor extends Atleta {
	private double velocidadeMedia;
	
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	@Override
	public void atualizarValor(double taxa) {
		// TODO Auto-generated method stub
		
	}
	
	/*@Override
	public double atualizarValor(double taxa) {
		// TODO Auto-generated method stub
		return super.atualizarValor(taxa * 2);
	}*/
}
