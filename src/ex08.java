import java.util.Scanner;

public class ex08 {
    // Faça um algoritmo que leia três valores inteiros diferentes e
    // imprima na tela os valores em ordem decrescente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores diferentes:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Verifica se os valores são diferentes
        while (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Os valores são iguais! Digite valores diferentes:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
        }

        int maior, meio, menor;

        if (num1 > num2 && num1 > num3) {
            maior =  num1;
            if (num2 > num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.println("Números em ordem decrescente: " + maior + ", " + meio + ", " + menor);

        sc.close();
    }
}
