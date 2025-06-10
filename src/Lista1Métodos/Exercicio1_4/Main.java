package Lista1Métodos.Exercicio1_4;

import java.util.Scanner;

import static Lista1Métodos.Exercicio1_4.ConversorTemperatura.celsiusParaFahrenheit;
import static Lista1Métodos.Exercicio1_4.ConversorTemperatura.fahrenheitParaCelsius;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Escolha a opção (1 ou 2): ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = entrada.nextDouble();
                double fahrenheit = celsiusParaFahrenheit(celsius);
                System.out.printf("Resultado: %.2f °C = %.2f °F\n", celsius, fahrenheit);
                break;

            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double f = entrada.nextDouble();
                double c = fahrenheitParaCelsius(f);
                System.out.printf("Resultado: %.2f °F = %.2f °C\n", f, c);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        entrada.close();
    }
}
