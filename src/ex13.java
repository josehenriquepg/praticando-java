import java.util.Scanner;

public class ex13 {
    // Faça algoritmo que leia o nome e a idade de uma peso e
    // imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = sc.next();
        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.print(nome + " é menor de idade");
        } else {
            System.out.print(nome + " é maior de idade");
        }

        sc.close();
    }
}
