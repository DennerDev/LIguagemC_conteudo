package Bebidas;

import javax.swing.JOptionPane;

public class Bebidas {
 
    private double agua; private double cerveja; private double energetico;
    private double refrigerante; private double vinho; private String name;  private String idade;

    public double getagua() {
        return agua;
    }
    public void setagua(double agua) {
        this.agua = agua;
    }

    public double getcerveja() {
        return cerveja;
    }
    public void setcerveja(double cerveja) {
        this.cerveja = cerveja;
    }

    public double getenergetico() {
        return energetico;
    }
    public void setenergetico(double energetico) {
        this.energetico = energetico;
    }

    public double getrefrigerante() {
        return refrigerante;
    }
    public void setrefrigerante(double refrigerante) {
        this.refrigerante = refrigerante;
    }

    public double getvinho() {
        return vinho;
    }
    public void setvinho(double vinho) {
        this.vinho = vinho;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIdade() {
       return idade;
    }
    public void setIdade(String idade) {
       this.idade = idade;
    }

    public void addBebidas() {

    this.agua = Integer.parseInt(JOptionPane.showInputDialog("agua R$ 1.99: "));
    this.cerveja = Integer.parseInt(JOptionPane.showInputDialog("Cerveja R$ 5.99: "));
    this.energetico = Integer.parseInt(JOptionPane.showInputDialog("Energetico R$ 8.99: "));
    this.refrigerante = Integer.parseInt(JOptionPane.showInputDialog("Refrigerante R$ 7.39"));
    this.vinho = Integer.parseInt(JOptionPane.showInputDialog("Vinho R$ 39.00: "));
    
    }

    public void verBebidas() {
        String mensagem = "Lista final das Bebidas: \n" + 
        "----------------------------------------------";    
        mensagem += "\nNome: " + this.name;
        mensagem += "\nSua Idade: " + this.idade;
        mensagem += "\nÁgua R$ 1.99 " + this.agua + " Total: " + this.agua * 1.99;
        mensagem += "\nCerveja R$ 5.99 " + this.cerveja + " Total: " + this.cerveja * 5.99;
        mensagem += "\nEnergetico R$ 8.99 " + this.energetico + " Total: " + this.energetico * 8.99;
        mensagem += "\nRefrigerante R$ 7.99 " + this.refrigerante + " Total: " + this.refrigerante * 5.99;
        mensagem += "\nVinho  R$ 39.00 " + this.vinho + " Total: " + this.vinho * 39.00 + "\n" +
        "----------------------------------------------\n";;

        mensagem += "Valor das Bebidas: " + ((this.agua * 1.99) + (this.cerveja * 5.99) + (this.energetico * 8.99)
                + (this.refrigerante * 7.39) + (this.vinho * 39.00));
                JOptionPane.showMessageDialog(null, mensagem);
    }

}

  
   
