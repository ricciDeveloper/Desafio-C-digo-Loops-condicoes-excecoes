package Desafio3;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Verifique se a idade é maior ou igual a 18 e imprima uma mensagem informando que o usuário é elegível para criar uma conta bancária:
        int idade = scanner.nextInt();
        if (idade >= 18){
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }
        else{
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }


// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
