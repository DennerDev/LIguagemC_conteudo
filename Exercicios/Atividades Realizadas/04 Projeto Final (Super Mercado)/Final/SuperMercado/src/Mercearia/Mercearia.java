package Mercearia;

import javax.swing.JOptionPane;

public class Mercearia {
  
    private double acucar; private double arroz; private double feijao; 
    private double oleo; private double sal;

    public double getAcucar() {
        return acucar;
    }
    public void setAcucar(double acucar) {
        this.acucar = acucar;
    }

    public double getArroz() {
        return arroz;
    }
    public void setArroz(double arroz) {
        this.arroz = arroz;
    }

    public double getFeijao() {
        return feijao;
    }
    public void setFeijao(double feijao) {
        this.feijao = feijao;
    }

    public double getOleo() {
        return oleo;
    }
    public void setOleo(double oleo) {
        this.oleo = oleo;
    }

    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }

    public void addMercearia() {
        this.acucar = Integer.parseInt(JOptionPane.showInputDialog("Açucar R$ 3.59: "));
        this.arroz = Integer.parseInt(JOptionPane.showInputDialog("Arroz R$ 21.00: "));
        this.feijao = Integer.parseInt(JOptionPane.showInputDialog("Feijao R$ 6.50: "));
        this.oleo = Integer.parseInt(JOptionPane.showInputDialog("Oléo R$ 7:99: "));
        this.sal = Integer.parseInt(JOptionPane.showInputDialog("Sal R$ 2.70: "));
    }

    public void verMercearia() {
        String mensagem = "Lista final da Merceadria \n" +
        "------------------------------";
        mensagem += "\nÁgua R$ 1.99 " + this.acucar + " Total: " + this.acucar * 3.59;
        mensagem += "\nArroz R$ 5.99 " + this.arroz + " Total: " + this.arroz * 21.00;
        mensagem += "\nFeijão R$ 8.99 " + this.feijao + " Total: " + this.feijao * 6.50;
        mensagem += "\nOléo R$ 7.99 " + this.oleo + " Total: " + this.oleo * 7.99;
        mensagem += "\nSal  R$ 2.70 " + this.sal+ " Total: " + this.sal* 2.70 + "\n" + 
        "------------------------------\n";

        mensagem += "Valor total Mercearia: " + ((this.acucar * 3.59 ) + (this.arroz * 21.00) + (this.feijao * 6.50)
                + (this.oleo * 7.99) + (this.sal* 2.70));
                JOptionPane.showMessageDialog(null, mensagem);
    }
}
