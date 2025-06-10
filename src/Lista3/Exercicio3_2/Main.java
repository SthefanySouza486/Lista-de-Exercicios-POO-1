package Lista3.Exercicio3_2;

import java.util.Scanner;

import static Lista3.Exercicio3_2.ValorContainer.trocarValores;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor para objA: ");
        int valorA = entrada.nextInt();
        ValorContainer objA = new ValorContainer(valorA);

        System.out.println("Digite o valor para objB: ");
        int valorB = entrada.nextInt();
        ValorContainer objB = new ValorContainer(valorB);

        System.out.println("\nAntes da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);


        trocarValores(objA, objB);

        System.out.println("\nDepois da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);
    }
}
