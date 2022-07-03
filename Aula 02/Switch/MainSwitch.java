package Switch;

// Estrutura de dados básico usando o switch

// Não pe necessario a ultilização das bibliotecas a baixo.
// import java.util.Scanner;
// import java.io.*;

class MainSwitch {
    public static void main(String args[]) throws java.io.IOException {
        System.out.println("Concorda ou não? (s/n) ");
        char c = (char) System.in.read();
        switch (c) {
            case 's':
                System.out.println("Concorda");
                break;
            case 'n':
                System.out.println("Não concorda");
                break;
            default:
                System.out.println("Resposta inválida");
                break;
        }
    }
}