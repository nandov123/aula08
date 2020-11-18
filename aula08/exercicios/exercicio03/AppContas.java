package aula08.exercicios.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menu, numeroConta, limite;
        double valor;
        ArrayList<Conta> listaContas = new ArrayList<>();
        Conta conta = null;

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
                conta = new ContaCorrente(numeroConta);
                listaContas.add(conta);
                break;
            case 2:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                System.out.print("Informe o limite da conta: ");
                limite = teclado.nextInt();
                conta = new ContaEspecial(numeroConta,limite);
                listaContas.add(conta);

                break;
            case 3:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                conta = new ContaPoupanca(numeroConta);
                listaContas.add(conta);
                break;
            case 4:
                System.out.print("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    for (Conta c : listaContas) {
                        if (conta.getNumero() == numeroConta) {
                            System.out.println("Informe o valor a ser depositado: ");
                            valor = teclado.nextDouble();
                            conta.depositar(valor);
                            System.out.println("Saldo atualizado: R$"+ c.getSaldo());
                        } else {
                            System.out.println("Conta não encontrada");
                        }                
                    }     

                break;
            case 5:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                for (Conta c : listaContas) {
                    if (conta.getNumero() == numeroConta) {
                        System.out.println("Informe o valor a ser sacado: ");
                        valor = teclado.nextDouble();
                        conta.sacar(valor);
                        System.out.println("Saldo atualizado: R$"+ c.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada");
                    }                
                }    

                break;
            case 6:
                System.out.print("Informe o número da conta: ");
                numeroConta = teclado.nextInt();
                for (Conta c : listaContas) {
                    if (c.getNumero() == numeroConta) {
                        System.out.println(c);
                    }                    
                }                

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
