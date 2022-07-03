// Estrutura de Controle Eroos (usando Try Catch e Try Catch Finally)

public class MainTry {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e ) {
            System.out.println("A frase inicial está nula, para solucional tal o problema, foi lhe atribuito um valor default ");

            frase = "Frase vazio";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase atinga: "+frase);
        System.out.println("Frase Nova  : "+novaFrase);
    }
}
