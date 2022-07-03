// Estrutura de Controle Eroos (usando Try Catch e Try Catch Finally)

public class MainTry2 {
    public static void main(String[] args) {
        int j = 5;

        try {
            j = 6;
        }
        catch (Exception e ) {
           System.out.println("Argumento invalido ou ausente. Usando default.");
      }
      finally {
            while (j >= 0 ){
            System.out.println(j); j--;
        }   
      }
    }
}
