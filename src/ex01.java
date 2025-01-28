import java.util.Scanner;

public class ex01 {
    // Faça um algoritmo que leia os valores de A, B, C e em seguida
    // imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void main(String[] args) {
        // Scanner é usado para capturar a entrada do usuário.
        Scanner sc = new Scanner(System.in);

        // Solicitar e ler os valores de A, B e C.
        System.out.println("Digite os valores de A, B e C, respectivamente:");
        // nextInt() lê os números inteiros digitados pelo usuário.
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Calculando a soma de A e B.
        int soma = A + B;

        // Mostrar o resultado.
        System.out.println("A soma de A e B é: " + soma);

        // Comparar resultado com C.
        if (soma < C) {
            System.out.print("A soma de A + B é menor que C");
        } else {
            System.out.print("A soma de A + B é maior que C");
        }

        // Fecha o Scanner
        sc.close();
    }
}