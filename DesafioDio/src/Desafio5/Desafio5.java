package Desafio5;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
    //inicializamos o scanner, criando o objeto, com método system.in para entrada de dados do usuário
    Scanner scanner = new Scanner(System.in);
    //variável sendo atribuída pelo scanner após entrada do usuário
    double limiteDiario = scanner.nextDouble();
    //variável de limite restante, para fazer a contagem no for
    double limiteRestante = limiteDiario;
    //for com variável contadora iniciada em 1
    for(int i = 1;;i++){
        //solicitamos o valor de saque
        double saque = scanner.nextDouble();
        //condição para que 0 feche o programa
        if(saque == 0){
            System.out.println("Transacoes encerradas.");
            break;
        }
        //condição para verificar se tem limite disponível para o saque
        if(saque > limiteRestante){
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            break;
        }//se tiver limite, será feito a subtração do saque ao valor de limite diário
        limiteRestante -= saque;
        System.out.println("Saque realizado. Limite restante: "+ limiteRestante);
    }
  }
}
