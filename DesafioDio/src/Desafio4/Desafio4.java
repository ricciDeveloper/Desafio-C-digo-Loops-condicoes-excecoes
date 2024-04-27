package Desafio4;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;
        double saldoTotal = saldo + limiteChequeEspecial;

        if (saque <= saldo){
            //Se o saque utilizar apenas o saldo
            System.out.println("Transacao realizada com sucesso.");
        }
        /* se o saque utilizar todo o saldo e parte do limite */
        else if(saque > saldo && saque <= saldoTotal){
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }
        else{
            // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close();
    }
}
