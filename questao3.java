/*Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA? */


public class questao3 {
  public static void main(String[] args) {
      int INDICE = 12, SOMA = 0, K = 1;

      while (K < INDICE) {
          K = K + 1;
          SOMA = SOMA + K;
      }

      System.out.println("O valor final de SOMA é: " + SOMA);
  }
}
