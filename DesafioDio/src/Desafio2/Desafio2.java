package Desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        //Instanciamos o Scanner para ler a entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        //usamos o try-with-resources para garantir o fechamento do scanner
        try (scanner) {
            //Fazemos a leitura da entrada do usuário com método nextLine do scanner
            String numeroConta = scanner.nextLine();
            //chamada do método de verificação de conta
            verificarNumeroConta(numeroConta);
            //impressão caso TRUE
            System.out.println("Numero de conta valido.");
        //bloco catch para captura de exceções
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
}

//método de verificação do tamanho da string ".length", junto a execeção criada para a verificação.
    private static void verificarNumeroConta(String numeroConta) {
        if(numeroConta.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
