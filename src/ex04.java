import java.util.Scanner;

public class ex04 {
    //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número aleatório:");
        int x = sc.nextInt();

        System.out.println("Seu antecessor é: " + (x - 1));
        System.out.println("Seu sucessor é: " + (x + 1));

        sc.close();
    }
}
