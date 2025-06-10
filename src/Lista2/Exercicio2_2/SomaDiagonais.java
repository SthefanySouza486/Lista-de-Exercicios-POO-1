package Lista2.Exercicio2_2;

import java.util.Scanner;

public class SomaDiagonais {
        private int[][] matriz;
        private int ordem;

        public SomaDiagonais(int ordem) {
            this.ordem = ordem;
            this.matriz = new int[ordem][ordem];
        }

        public void preencherMatriz(Scanner scanner) {
            System.out.println("Digite os elementos da matriz:");
            for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        public int calcularSomaDiagonalPrincipal() {
            int soma = 0;
            for (int i = 0; i < ordem; i++) {
                soma += matriz[i][i];
            }
            return soma;
        }

        public int calcularSomaDiagonalSecundaria() {
            int soma = 0;
            for (int i = 0; i < ordem; i++) {
                soma += matriz[i][ordem - 1 - i];
            }
            return soma;
        }

        public void exibirMatriz() {
            System.out.println("Matriz:");
            for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
