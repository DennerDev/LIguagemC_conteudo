import javax.swing.JOptionPane;

public class TesteProduto {

	public static void main(String[] args) {
		/* COMPOSIÇÃO
		 * A composição é uma variação da agregação
		 * Todo - Parte
		 * Na composição o objeto-pai (todo) é responsável por criar e destruir
		 * suas partes. Na composição um mesmo objeto-parte não pode se 
		 * associar a mais de um objeto-pai
		 * */
		
		DataFabricacao dtFabri = new DataFabricacao();
		dtFabri.setDia(4);
		dtFabri.setMes(5);
		dtFabri.setAno(2022);
		
		Produto pendrive = new Produto();
		pendrive.setDescricao("Pendrive de 32 GB");
		pendrive.setDataFabri(dtFabri);
		
		JOptionPane.showMessageDialog(null, "O produto: " + pendrive.getDescricao() + " foi fabricado em " + pendrive.getDataFabri().dataCompleta()); 

	}

}
