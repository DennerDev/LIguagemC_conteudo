
public class TesteTime {

	public static void main(String[] args) {
		
		Time time = new Time();
		time.setCodigoTime(55);
		time.setNomeTime("Cruzeiro do Sul");
		
		System.out.println("O time é: " + time.getNomeTime());
		System.out.println("O nome do atleta é: " + time.getAtleta().getNome());
		

	}

}
