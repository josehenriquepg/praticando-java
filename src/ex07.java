import java.util.Scanner;

public class ex07 {
    // Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha entre verdadeiro ou falso.");
        System.out.println("Verdadeiro ou Falso(true/false):");
        boolean valor1 = sc.nextBoolean();
        System.out.println("Verdadeiro ou Falso(true/false):");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos os valores são VERDADEIROS.");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos os valores são FALSOS.");
        } else {
            System.out.println("Os valores são diferentes.");
        }

        sc.close();
    }
}
