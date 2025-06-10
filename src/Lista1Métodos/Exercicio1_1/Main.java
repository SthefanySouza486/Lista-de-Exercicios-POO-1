package Lista1Métodos.Exercicio1_1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            CalculadoraSimples calculadora = new CalculadoraSimples();

            System.out.print("Digite o primeiro número: ");
            double num1 = entrada.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = entrada.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int escolha = entrada.nextInt();
            double resultado;

            try {
                switch (escolha) {
                    case 1:
                        resultado = calculadora.somar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = calculadora.subtrair(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = calculadora.multiplicar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        resultado = calculadora.dividir(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    default:
                        System.out.println("Operação inválida.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            entrada.close();
        }
    }
