package Lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
            int opcao;

            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Cadastrar Funcionário");
                System.out.println("2. Calcular Total de Salários por Departamento");
                System.out.println("3. Listar Funcionários");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = entrada.nextInt();
                entrada.nextLine(); // limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = entrada.nextLine();
                        System.out.print("ID: ");
                        int id = entrada.nextInt();
                        System.out.print("Salário: ");
                        double salario = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Departamento: ");
                        String departamento = entrada.nextLine();

                        Funcionario f = new Funcionario(nome, id, salario, departamento);
                        listaFuncionarios.add(f);
                        System.out.println("Funcionário cadastrado com sucesso!");
                        break;

                    case 2:
                        System.out.print("Informe o departamento: ");
                        String depto = entrada.nextLine();
                        double total = 0;
                        for (Funcionario func : listaFuncionarios) {
                            if (func.getDepartamento().equalsIgnoreCase(depto)) {
                                total += func.getSalario();
                            }
                        }
                        System.out.println("Total de salários no departamento '" + depto + "': R$" + total);
                        break;

                    case 3:
                        if (listaFuncionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado.");
                        } else {
                            System.out.println("Funcionários cadastrados:");
                            for (Funcionario func : listaFuncionarios) {
                                System.out.println(func);
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 0);

            entrada.close();
        }
    }
