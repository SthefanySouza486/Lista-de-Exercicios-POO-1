package Lista1Métodos.Exercicio1_2;

import java.util.Scanner;

import static Lista1Métodos.Exercicio1_2.Palindromo.ehPalindromo;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String palavra = entrada.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        entrada.close();
    }
}

