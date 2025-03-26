import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o seu Nome");
        String nome = leitura.nextLine();

        int aleatorio = 1;

        String tipoConta = "Corrente";
        double saldo = 2500.00;

        String menu = """
                ***********Bem vindo ao Menu!*******
                
                Escolha a operação que desejar realizar:
                
                                 [1] - Consultar saldo
                                 [2] - Receber valor
                                 [3] - Transferir valor
                                 [4] - Sair
                """;

        String dadosIniciais = """
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                """.formatted(nome,tipoConta,saldo);

        System.out.println(dadosIniciais);


        while (aleatorio == 1){

            System.out.println(menu);
            int opcaoEscolhida = leitura.nextInt();

            if (opcaoEscolhida == 1){
                System.out.println("O seu saldo é de:  R$" + saldo);


            } else if (opcaoEscolhida == 2) {
                System.out.println("Qual o valor que você deseja receber? ");
                double valorEscolhido = leitura.nextDouble();
                if (valorEscolhido > 0){
                    saldo += valorEscolhido;
                } else {
                    System.out.println("É necessário receber um valor acima de R$0,00");
                }

            } else if (opcaoEscolhida == 3) {
                System.out.println("Qual o valor que você deseja transferir? ");
                double valorTransferido = leitura.nextDouble();

                if (valorTransferido > saldo){
                    System.out.println("Você não possui saldo o suficiente para fazer essa transferência, tente novamente");
                } else {
                    saldo -= valorTransferido;
                }
            } else if (opcaoEscolhida == 4) {
                System.out.println("Você está saindo do sistema! Até logo");
                break;
            } else {
                System.out.println("Opção Inválida! Tente novamente");
            }
        }

    }
}