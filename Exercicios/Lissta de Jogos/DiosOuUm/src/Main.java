import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, c, p;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Começaremos agora o jogo de 2 ou 1");

            System.out.println("André, digite 1 ou 2");
            a = entrada.nextInt();
            while (a != 1 && a != 2) {
                System.out.println("Digite somente 1 ou 2");
                a = entrada.nextInt();
            }

            System.out.println("Carlos, digite 1 ou 2");
            c = entrada.nextInt();
            while (c != 1 && c != 2) {
                System.out.println("Digite somente 1 ou 2");
                c = entrada.nextInt();
            }

            System.out.println("Pietro, digite 1 ou 2");
            p = entrada.nextInt();
            while (p != 1 && p != 2) {
                System.out.println("Digite somente 1 ou 2");
                p = entrada.nextInt();
            }
        }

        declarandovencedor(a, p, c);
    }

    public static void declarandovencedor(int a, int p, int c) {
        if (a != c && a != p) {
            System.out.println("O vencedor é André!");
        } else if (c != a && c != p) {
            System.out.println("O vencedor é o Carlos");
        } else if (p != a && p != c) {
            System.out.println("O vencedor é o Pietro");
        } else {
            System.out.println("Não houve vencedores!");
        }
    }
}