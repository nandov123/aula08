package aula09.exemplos.exemplo01;


import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menu, numeroConta;
        double valor, limite;
        GerenciaConta gerenciaConta = new GerenciaConta();


        do {
        System.out.println("1-Nova Conta Corrente");
        System.out.println("2-Nova Conta Especial");
        System.out.println("3-Nova Conta Poupança");
        System.out.println("4-Fazer Depósito");
        System.out.println("5-Fazer saque");
        System.out.println("6-Exibir saldo");
        System.out.println("7-Sair");
        menu = teclado.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                gerenciaConta.novaContaCorrente(numeroConta);
                break;
            case 2:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                System.out.print("Informe o limite da conta: ");
                limite = teclado.nextInt();
                gerenciaConta.novaContaEspecial(numeroConta,limite);
                break;
            case 3:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                gerenciaConta.novaContaPoupanca(numeroConta);
                break;
            case 4:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Informe o valor a ser depositado: ");
                valor = teclado.nextDouble();
                if (gerenciaConta.depositar(numeroConta, valor)) {
                    System.out.println("Depósito realizado.");
                } else {
                    System.out.println("Depósito não realizado.");
                }
                         

                break;
            case 5:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Informe o valor a ser sacado: ");
                valor = teclado.nextDouble();
                if (gerenciaConta.sacar(numeroConta, valor)) {
                    System.out.println("Saque realizado.");
                } else {
                    System.out.println("Saque não realizado.");
                }

                break;
            case 6:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println(gerenciaConta.exibir(numeroConta));                

                break;
            case 7:

                break;
            
        
            default:
                System.out.println("Opção inválida.");
                break;
            
        }

        } while (menu != 7);

        teclado.close();


    }
    
}
