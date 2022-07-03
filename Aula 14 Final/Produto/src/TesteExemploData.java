import javax.swing.JOptionPane;

public class TesteExemploData {

	public static void main(String[] args) {

		int mes  = Integer.parseInt(JOptionPane.showInputDialog("Mês"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		
		ExemploData data = new ExemploData(mes,ano);
		
		String texto = "Mês e ano: " + data.getMes() + "/" + data.getAno();
		
		JOptionPane.showMessageDialog(null, texto);

	}

}
