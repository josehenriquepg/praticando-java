import java.util.Scanner;

public class ex02 {
    // Faça um algoritmo para receber um número qualquer
    // e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número aleatório:");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            if (x > 0) {
                System.out.println("O número digitado é PAR e é Positivo");
            } else {
                System.out.println("O número digitado é PAR e é Negativo");
            }
        } else {
            if (x > 0) {
                System.out.println("O número digitado é ÍMPAR e é Positivo");
            } else {
                System.out.println("O número digitado é ÍMPAR e é Negativo");
            }
        }

        sc.close();
    }
}
