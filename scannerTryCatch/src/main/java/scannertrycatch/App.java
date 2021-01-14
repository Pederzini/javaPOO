package scannertrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem vindo!");
        
        try {
            System.out.println("Por favor, digite um número de 1 a 100:");
            int n1 = leitor.nextInt();
            System.out.println("Por favor, digite outro número de 1 a 100:");
            int n2 = leitor.nextInt();
            int soma = n1 + n2;
            System.out.println("A soma entre os dois números digitados é: " + soma);
        } catch (InputMismatchException e) {
            System.out.println("Opa! Digite somente números");
            System.out.println(e);
        }
        
        
        // Para ler o que o usuário vai entrar, usar a classe scanner
    }
}
