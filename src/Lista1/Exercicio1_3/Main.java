package Lista1.Exercicio1_3;

import java.util.Scanner;

import static Lista1.Exercicio1_3.Fatorial.fatorial;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Digite um valor não negativo.");
        } else {
            long resultado = fatorial(numero);
            System.out.println("Fatorial de " + numero + " é: " + resultado);
        }

        entrada.close();
    }
}
