import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  throws Exception{
        //TODO: Conhecer e importar a Classe Scanner

        //TODO: Exibir as mensagens para o nosso usuário:
        // Com Entrada: 1)Digite seu Nome e mostrar nome com saldo inicial 1000 reais
        // 2) opção de Menu
        // a)Sacar b)Depositar e atualizar saldo ou consistir se o valor de saque for maior
        // Validando pelo Scanner as interações
        // Finalizar o loop se o usuario nao quiser mais
        // Exibir a mensagem fim

        Scanner scanner = new Scanner(System.in);

        //Solicitar nome Usuario
        System.out.println("***********Bem-Vindo ao Banco Terminal*************");
        System.out.println("Por favor, digite seu nome.................");
        String nome = scanner.nextLine();

        double saldo = 1000.00; //Saldo Incial
        boolean continuar = true;

        System.out.println("\nOlá, "+nome + "! Seu saldo inicial é: R$ "+ saldo);

        while (continuar) {
            System.out.println("\nEscolha uma opção abaixo:");

            System.out.println("1: Sacar");
            System.out.println("2: Depositar");
            System.out.println("3: Ver Saldo");
            System.out.println("4: Sair");
            System.out.println("Opção: ");

            int opcao;
            try {
                opcao = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Por favor digite um número válido!");
                scanner.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para o saque: R$ ");
                    double valorSaque = scanner.nextDouble();

                    if (valorSaque <= 0) {
                        System.out.println("Valor do saque inválido!");
                    } else if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente para realizar o saque!");
                    }else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Saldo atualizado de: R$ "+ saldo);
                    }
                    break;

                case 2:
                    System.out.println("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();

                    if (valorDeposito <= 0) {
                        System.out.println("Valor de depósito inválido!");
                    }else {
                        saldo += valorDeposito;
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("Saldo atualizado de: R$ "+ saldo);
                    }
                    break;

                case 3:
                    System.out.println("Seu Saldo atual é: R$ "+ saldo);
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Obrigado por usar nossos serviços. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha um número entre 1 e 4.");
            }
        }

        scanner.close();

    }
}
