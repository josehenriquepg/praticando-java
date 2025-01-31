import java.util.Scanner;

public class ex19 {
    // Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada");
        System.out.println("Digite um número inteiro:");
        int i = sc.nextInt();

        System.out.println("Tabuada do " + i + ":");
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%d x %d = %d%n", i, j, i * j);
        }
    }
}
