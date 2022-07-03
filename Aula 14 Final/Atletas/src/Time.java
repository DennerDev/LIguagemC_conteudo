/* AGREGAÇÃO
 * Objeto-todo / Objeto-parte
 * Na agregação tenta-se mostrar que as informações de um 
 * objeto-todo precisa ser complementada pelas informações 
 * contidas no objeto-parte.
 * Todo/Parte
 * */
public class Time {
	/* camelCase
	 * PascalCase
	 * snake_case
	 * kebab-case
	 * UPPER_SNAKE_CASE
	 * */
	private int codigoTime;
	private String nomeTime;
	private Atleta atleta;
	
	public int getCodigoTime() {
		return codigoTime;
	}
	public void setCodigoTime(int codigoTime) {
		this.codigoTime = codigoTime;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}
}
