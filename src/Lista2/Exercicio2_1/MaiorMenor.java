package Lista2.Exercicio2_1;

import java.util.Scanner;

public class MaiorMenor {
    private int[][] dados;
    private int linhas;
    private int colunas;

    public MaiorMenor(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    public void preencherMatriz(Scanner scanner) {
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                dados[i][j] = scanner.nextInt();
            }
        }
    }

    public int encontrarMaior() {
        int maior = dados[0][0];
        for (int[] linha : dados) {
            for (int valor : linha) {
                if (valor > maior) {
                    maior = valor;
                }
            }
        }
        return maior;
    }

    public int encontrarMenor() {
        int menor = dados[0][0];
        for (int[] linha : dados) {
            for (int valor : linha) {
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        return menor;
    }
}

