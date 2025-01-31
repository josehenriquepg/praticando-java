import java.util.Scanner;

public class ex14 {
    // Faça um algoritmo que receba um valor A e B, e troque o
    // valor de A por B e o valor de B por A e imprima na tela os valores.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um valor inteiro para A:");
        int a = sc.nextInt();
        System.out.println("Escolha um valor inteiro para B:");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Após a troca:");
        System.out.println("A = " + a);
        System.out.print("B = " + b);

        sc.close();
    }
}
