
public class DataFabricacao {
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	 public void setDia(int dia) {
		this.dia = dia;
	}
	 public void setMes(int mes) {
		this.mes = mes;
	}
	 public void setAno(int ano) {
		this.ano = ano;
	}
	 
	 public String dataCompleta() {
		 return this.dia + "/" + this.mes + "/" + this.ano;
	 }
}
