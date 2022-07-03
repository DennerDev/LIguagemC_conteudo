package Congelado;

import javax.swing.JOptionPane;

public class Congelados {
    private double acai;
    private double babatataCongelada;
    private double escondidinhoCarne;
    private double sorverte;
    private double hamburguer;

    public double getAcai() {
        return acai;
    }

    public void setAcai(double acai) {
        this.acai = acai;
    }

    public double getBabatataCongelada() {
        return babatataCongelada;
    }

    public void setBabatataCongelada(double babatataCongelada) {
        this.babatataCongelada = babatataCongelada;
    }

    public double getEscondidinhoCarne() {
        return escondidinhoCarne;
    }

    public void setEscondidinhoCarne(double escondidinhoCarne) {
        this.escondidinhoCarne = escondidinhoCarne;
    }

    public double getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(double hamburguer) {
        this.hamburguer = hamburguer;
    }

    public double getSorverte() {
        return sorverte;
    }

    public void setSorverte(double sorverte) {
        this.sorverte = sorverte;
    }

    public void addCogelados() {
        this.acai = Integer.parseInt(JOptionPane.showInputDialog("Açai R$ 12.00: "));
        this.babatataCongelada = Integer.parseInt(JOptionPane.showInputDialog("BabatataCongelada R$ 26.99: "));
        this.escondidinhoCarne = Integer.parseInt(JOptionPane.showInputDialog("EscondidinhoCarne R$ 10.00: "));
        this.hamburguer = Integer.parseInt(JOptionPane.showInputDialog("Hamburguer R$ 18.00"));
        this.sorverte = Integer.parseInt(JOptionPane.showInputDialog("Sorverte R$ 25.00: "));

    }
    
    public void verCongelados() {
        String mensagem = "Lista final dos Congelados \n"  +
        "----------------------------------------------";;
        mensagem += "\nAçai R$ 12.00 " + this.acai + " Total " + this.acai  * 12.00;
        mensagem += "\nBabata Congelados R$ 26.99 " + this.babatataCongelada + " Total " + this.babatataCongelada  * 26.99;
        mensagem += "\nEscondidinho de Carne R$ 10.00 " + this.escondidinhoCarne + " Total " + this.escondidinhoCarne  * 10.00;
        mensagem += "\nHamburguer R$ 18.00 " + this.hamburguer + " Total " + this.hamburguer  * 18.00;
        mensagem += "\nSorvete R$ 25.00 " + this.sorverte + " Total " + this.sorverte  * 25.00 + "\n" +
        "----------------------------------------------";

        mensagem += "Valor total Mercearia: " + ((this.acai * 12.00 ) + (this.babatataCongelada * 26.99) + (this.escondidinhoCarne * 10.00)
                + (this.hamburguer * 18.00) + (this.hamburguer* 25.00));
                JOptionPane.showMessageDialog(null, mensagem);
    }
}
