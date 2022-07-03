import java.util.Scanner;

public class Jokenpo {
    private static int placarjogador = 0;
    private static int placarcomputador = 0;
    private static int escolhajogador;
    private static int escolhacomputador;

    public static void main(String[] args) {
        int rodadas = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a quantidade de rodadas: ");
        rodadas = input.nextInt();
        for (int i = 1; i <= rodadas; i++) {
            escolhacomputador = (int) (Math.random() * 3) + 1;
            LabelEscolha();
            escolhajogador = input.nextInt();
            Verifica();
            Placar();
        }
        System.out.print("\n");
        System.out.println("::: GAME OVER");
        Resultado();
    }

    public static void Resultado() {
        if (placarjogador > placarcomputador) {
            System.out.println("Jogador ganhou!");
            System.out.println("Pontos: " + placarjogador);
        } else if (placarjogador < placarcomputador) {
            System.out.println("Computador ganhou!");
            System.out.println("Pontos: " + placarcomputador);
        } else {
            System.out.println("Empate!");
            System.out.println("Pontos do Jogador: " +
                    placarjogador);
            System.out.println("Pontos do Computador: " +
                    placarcomputador);
        }
    }

    public static void LabelEscolha() {
        System.out.print("\n");
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("::: ESCOLHA");
        System.out.println("::: 1. Pedra");
        System.out.println("::: 2. Papel");
        System.out.println("::: 3. Tesoura");
        System.out.print("::: Escolha sua opção: ");
    }

    public static void Verifica() {
        // Verificação de vitória e derrota
        if (escolhacomputador == escolhajogador) {
            System.out.print("\n");
            System.out.println("::: EMPATE");
        } else if (escolhacomputador == 1 && escolhajogador == 2) {
            System.out.print("\n");
            System.out.println("::: JOGADOR WIN");
            placarjogador++;
        } else if (escolhacomputador == 1 && escolhajogador == 3) {
            System.out.print("\n");
            System.out.println("::: COMPUTADOR WIN");
            placarcomputador++;
        } else if (escolhacomputador == 2 && escolhajogador == 1) {
            System.out.print("\n");
            System.out.println("::: COMPUTADOR WIN");
            placarcomputador++;
        } else if (escolhacomputador == 2 && escolhajogador == 3) {
            System.out.print("\n");
            System.out.println("::: JOGADOR WIN");
            placarjogador++;
        } else if (escolhacomputador == 3 && escolhajogador == 1) {
            System.out.print("\n");
            System.out.println("::: JOGADOR WIN");
            placarjogador++;
        } else if (escolhacomputador == 3 && escolhajogador == 2) {
            System.out.print("\n");
            System.out.println("::: COMPUTADOR WIN");
            placarcomputador++;
        }
    }

    public static void Placar() {
        // Exibir placar
        System.out.print("\n");
        System.out.println("::: PLACAR");
        System.out.println("Computador: " + placarcomputador);
        System.out.println("Jogador: " + placarjogador);
        System.out.println(":::");
    }
}