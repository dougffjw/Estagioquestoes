/*Escreva um programa que verifique, em uma string,
 a existência da letra ‘a’, seja maiúscula ou minúscula,
 além de informar a quantidade de vezes em que ela ocorre. */

 import java.util.Scanner;

public class questao2 {
    public static int contarA(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scan.nextLine();

        int qtdA = contarA(texto);

        if (qtdA > 0) {
            System.out.println("A letra 'a' aparece " + qtdA + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }
}
