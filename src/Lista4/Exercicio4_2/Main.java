package Lista4.Exercicio4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            ArrayList<Contato> contatos = new ArrayList<>();
            int opcao;

            do {
                System.out.println("\n--- MENU AGENDA ---");
                System.out.println("1. Adicionar Contato");
                System.out.println("2. Listar Contatos");
                System.out.println("3. Procurar Contato por Nome");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {
                    case 1:
                        if (contatos.size() >= 10) {
                            System.out.println("Agenda cheia! Máximo de 10 contatos.");
                        } else {
                            System.out.print("Nome: ");
                            String nome = entrada.nextLine();
                            System.out.print("Telefone: ");
                            String telefone = entrada.nextLine();
                            System.out.print("Email: ");
                            String email = entrada.nextLine();

                            contatos.add(new Contato(nome, telefone, email));
                            System.out.println("Contato adicionado com sucesso!");
                        }
                        break;

                    case 2:
                        if (contatos.isEmpty()) {
                            System.out.println("Nenhum contato na agenda.");
                        } else {
                            System.out.println("Contatos armazenados:");
                            for (Contato c : contatos) {
                                System.out.println(c);
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Digite o nome do contato: ");
                        String nomeBusca = entrada.nextLine();
                        boolean encontrado = false;
                        for (Contato c : contatos) {
                            if (c.getNome().equalsIgnoreCase(nomeBusca)) {
                                System.out.println("Telefone: " + c.getTelefone());
                                System.out.println("Email: " + c.getEmail());
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Contato não encontrado.");
                        }
                        break;

                    case 0:
                        System.out.println("Encerrando a agenda...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 0);

            entrada.close();
        }
    }

