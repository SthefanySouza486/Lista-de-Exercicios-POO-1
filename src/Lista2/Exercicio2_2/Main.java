package Lista2.Exercicio2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a ordem da matriz: ");
        int ordem = entrada.nextInt();

        SomaDiagonais matriz = new SomaDiagonais(ordem);
        matriz.preencherMatriz(entrada);
        matriz.exibirMatriz();

        int somaPrincipal = matriz.calcularSomaDiagonalPrincipal();
        int somaSecundaria = matriz.calcularSomaDiagonalSecundaria();

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        entrada.close();
    }
}
