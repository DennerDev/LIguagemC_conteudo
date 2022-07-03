import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        var rnd = new Random();

        int numGerado = rnd.nextInt(2);
        int num = 0; 

        System.out.println(rnd);


        JOptionPane.showMessageDialog(null, "Bem Vindo ao Jogo Cara ou Coroa " );
        JOptionPane.showMessageDialog(null, "O número 0 será Cara - 1 será Coroa " );

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha 0 ou 1"));
        JOptionPane.showMessageDialog(null, "Vamos ver o resultado " );

        if(num == numGerado) {
            JOptionPane.showMessageDialog(null, "Voce ganhou " + "O Ressultao foi " + numGerado );
        }
        else
            JOptionPane.showMessageDialog(null, "Voce perdeu " + "O Ressultao foi " + numGerado );
    }
}

