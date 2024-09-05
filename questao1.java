/*Dado a sequência de Fibonacci, onde se inicia por 0
 e 1 e o próximo valor sempre será a soma dos 2 valores
  anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
   escreva um programa na linguagem que desejar onde, informado
    um número, ele calcule a sequência de Fibonacci e
     retorne uma mensagem avisando se o número informado
      pertence ou não a sequência.*/

import java.util.Scanner;

public class questao1 {
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scan.nextInt();

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}
