import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prints prints = new Prints();
        ArrayList<BancoInterface> contas = new ArrayList<>();

        prints.apresentacao();
        int opcao = 0;

        BancoInterface conta1 = new ContCorrente("João");
        conta1.depositar(150.00);
        contas.add(conta1);

        BancoInterface conta2 = new ContPoupanca("Maria");
        conta2.depositar(300.00);
        contas.add(conta2);

        BancoInterface conta3 = new ContCorrente("Carlos");
        conta3.depositar(50.00);
        contas.add(conta3);

        while (opcao != 7) {
            prints.menu();
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do titular: ");
                    String nome = input.nextLine();
                    System.out.print("Tipo da conta (1 para Corrente, 2 para Poupança): ");
                    int tipoConta = input.nextInt();
                    input.nextLine();
                    if (tipoConta == 1) {
                        BancoInterface userConta = new ContCorrente(nome);
                        contas.add(userConta);
                        prints.contaCriada("Corrente", nome);
                        int numeroConta = contas.size() - 1;
                        System.out.println("Conta cadastrada com índice interno: " + numeroConta);

                    } else if (tipoConta == 2) {
                        BancoInterface userConta = new ContPoupanca(nome);
                        contas.add(userConta);
                        prints.contaCriada("Poupança", nome);
                        int numeroConta = contas.size() - 1;
                        System.out.println("Conta cadastrada com índice interno: " + numeroConta);

                    } else {
                        System.out.println("Tipo de conta inválido.");
                    }
                    break;

                case 2:
                    System.out.println("Contas cadastradas:");
                    if (contas.isEmpty()) {
                        System.out.println("Nenhuma conta encontrada.");
                    } else {
                        for (int i = 0; i < contas.size(); i++) {
                            Conta conta = (Conta) contas.get(i);
                            System.out.println((i + 1) + ". Titular: " + conta.getTitular() +
                                    " | Saldo: R$" + conta.getSaldo());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da conta para depósito: ");
                    int indexDeposito = input.nextInt() - 1;
                    input.nextLine();
                    if (indexDeposito >= 0 && indexDeposito < contas.size()) {
                        System.out.print("Valor para depositar: R$");
                        double valor = input.nextDouble();
                        contas.get(indexDeposito).depositar(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da conta para saque: ");
                    int indexSaque = input.nextInt() - 1;
                    input.nextLine();
                    if (indexSaque >= 0 && indexSaque < contas.size()) {
                        System.out.print("Valor para sacar: R$");
                        double valor = input.nextDouble();
                        contas.get(indexSaque).sacar(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Número da conta de origem: ");
                    int indexOrigem = input.nextInt() - 1;
                    System.out.print("Número da conta de destino: ");
                    int indexDestino = input.nextInt() - 1;
                    System.out.print("Valor para transferir: R$");
                    double valor = input.nextDouble();
                    input.nextLine();

                    if (indexOrigem >= 0 && indexOrigem < contas.size() &&
                            indexDestino >= 0 && indexDestino < contas.size()) {

                        contas.get(indexOrigem).transferir(valor, contas.get(indexDestino));
                    } else {
                        System.out.println("Conta(s) inválida(s).");
                    }
                    break;

                case 6:
                    System.out.print("Digite o número da conta para consultar saldo: ");
                    int indexSaldo = input.nextInt() - 1;
                    input.nextLine();
                    if (indexSaldo >= 0 && indexSaldo < contas.size()) {
                        Conta conta = (Conta) contas.get(indexSaldo);
                        System.out.println("Titular: " + conta.getTitular());
                        System.out.println("Saldo atual: R$" + conta.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        input.close();
    }
}
