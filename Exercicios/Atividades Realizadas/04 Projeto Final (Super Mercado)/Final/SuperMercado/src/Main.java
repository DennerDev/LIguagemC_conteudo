import javax.swing.JOptionPane;

import Bebidas.*;
import Mercearia.*;
import Congelado.*;

public class Main {
   public static void main(String[] args) {

      JOptionPane.showMessageDialog(null, "  Seja Bem Vindo Super Marcado Z ");
      JOptionPane.showMessageDialog(null, "  Aqui você criar a sua lista de Compras ");
      JOptionPane.showMessageDialog(null, "     Veja nos setores disponiveis abaixo\n" +
            "//------------------------------------//  \n" +
            "                Mercearia                 \n" +
            "                Bebidas                   \n" +
            "                Congelados                \n" +
            "//------------------------------------//  \n" +
            "               Vamos começar                ");

      JOptionPane.showMessageDialog(null, "Mercearia" );      
      Mercearia mercearia = new Mercearia();
      mercearia.addMercearia();
      mercearia.verMercearia();

      JOptionPane.showMessageDialog(null, "Bebidas");  
      Bebidas bebidas = new Bebidas();
      bebidas.addBebidas();
      bebidas.verBebidas();

      JOptionPane.showMessageDialog(null, "Congelados"); 
      Congelados congelados = new Congelados();
      congelados.addCogelados();
      congelados.verCongelados();
      

   }

}
