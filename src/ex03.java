import java.util.Scanner;

public class ex03 {
    // Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
    // deverá somar os dois valores, caso contrário devera multiplicar A por B.
    // Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de A e B, respectivamente:");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A == B) {
            int C = A + B;
            System.out.print("O resultado da soma de A + B é: " + C);
        } else {
            int C = A * B;
            System.out.print("O resultado da multiplicação de A x B é: " + C);
        }

        sc.close();
    }
}
