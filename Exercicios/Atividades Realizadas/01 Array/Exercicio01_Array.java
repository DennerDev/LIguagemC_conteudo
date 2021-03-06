/**
 * Escreva um programa que faz a leitura de N valores inteiros
 * para criar um Array de tamanho N. Insira os números inteiros no Array e após isso exiba o maior número
 * e a posição dele no Array.
 */

import java.util.*;

public class Exercicio {
  public static void main(String[] args) {

  int tamanho;  int maior = 0;
    
  Scanner ler = new Scanner(System.in);

  System.out.println("Qual o tamanho da lista?");
  tamanho = ler.nextInt();

  int[] numeros = new int[tamanho];
  for(int i = 0; i < numeros.length; i++) {
  System.out.println("Insira a posição " + i + " da lista:");

  numeros[i] = ler.nextInt();
    }
  System.out.println("A lista gerada é: ");
  System.out.println(Arrays.toString(numeros));

  // Encontrar p maior numero e indicar o posição dele dentro do vetor
  int indiceMaior = -1;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
        indiceMaior = i;
    }
   }
    System.out.printf("Maior número é %d, no índice %d", maior, indiceMaior);
  }   
}
