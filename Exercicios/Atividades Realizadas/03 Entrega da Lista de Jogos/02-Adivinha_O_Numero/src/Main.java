import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var rnd = new Random();
        int numEscondido = rnd.nextInt(100);
        int num = 0;
        int tent = 0;

        JOptionPane.showMessageDialog(null,"Tente adivinhar o número escondido (De 0 até 100)!");
        do{
            tent++;
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero: "));
            if(num>numEscondido){
                JOptionPane.showMessageDialog(null, "Tente um numero menor!" );
            }
            else if(num<numEscondido){
                JOptionPane.showMessageDialog(null, "Tente um numero maior!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Parabens! Adivinhou o numero escondido: " + num);

                JOptionPane.showMessageDialog(null, "Você acertou em : " + tent + " Tentativas");
            }
        }while(num!=numEscondido);
        System.exit(0);
    }
}