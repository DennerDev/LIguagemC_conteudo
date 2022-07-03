
public abstract class Ciclista {
	private String modeloDeBicicleta;

	public String getModeloDeBicicleta() {
		return modeloDeBicicleta;
	}

	public void setModeloDeBicicleta(String modeloDeBicicleta) {
		this.modeloDeBicicleta = modeloDeBicicleta;
	}
	
	public abstract void pedaladas(int giros);

}
