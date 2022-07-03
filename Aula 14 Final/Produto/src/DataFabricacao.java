/*CONSTRUTORES
 *Métodos contrutores
 *
 *O pseudo(método) contrutor determina que ações devem ser executadas 
 *quando da criação de um objeto.
 *
 *Em Java, o construtor é definido por meio de um método com o mesmo nome
 *da classe e sem indicação de um tipo de retorno. No caso do retorno deste
 *método não utilizamos nem mesmo o void.
 *
 *O construtor é invocado no momento da criação de um objeto. Ao criar o
 *objeto utilizamos o operador 'new'.
 *
 *O retorno do operador 'new' é uma referência a um objeto recém criado.
 *O construtor pode receber argumentos como qualquer outro método criado
 *dentro do projeto.
 *
 *Caso seja utilizado a sobrecarga de método podemos criar mais de um 
 *construtor.
 *
 *Toda classe tem pelo menos um construtor. Quando nenhum construtor é 
 *inserido explicitamente, no caso do JAVA, um construtor padrão, que 
 *não recebe argumentos, é incluído para a classe pelo compilador.
 *
 *No momento que um construtor é criado a sequência de passos a seguir 
 *é executada:
 * 1. O espaço para o objeto é alocado e seu conteúdo é inicializado com zeros
 * 2. O construtor da classe base é invocado. Caso não exista uma classe base
 * definida explicitamente, a classe Object é definida como base.
 * 3. Os membros da classe são inicializados para o objeto. Na ordem que foram
 * criados
 * 4. O restante do construtor é executado
 * 
 * */
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
	 
	 public DataFabricacao() {
		
	 }
	 
	 public DataFabricacao(int dia, int mes, int ano) {
		 this.dia = dia;
		 this.mes = mes;
		 this.ano = ano;
	 }
}
