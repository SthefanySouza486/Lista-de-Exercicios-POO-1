package Lista2.Exercicio2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe o número de linhas: ");
        int linhas = entrada.nextInt();

        System.out.print("Informe o número de colunas: ");
        int colunas = entrada.nextInt();

        MaiorMenor matriz = new MaiorMenor(linhas, colunas);


        matriz.preencherMatriz(entrada);
        int maior = matriz.encontrarMaior();
        int menor = matriz.encontrarMenor();

        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        entrada.close();
    }
}

