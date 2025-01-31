import java.util.Scanner;

public class ex21 {
    // Faça um algoritmo que leia dois valores inteiros A e B,
    // imprima na tela o quociente e o resto da divisão inteira entre eles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.print("Erro: divisão por zero não é permitida.");
        } else {
            int quo = num1 / num2;
            int res = num1 % num2;

            System.out.printf("Quociente: %d%n", quo);
            System.out.printf("Resto: %d%n", res);
        }

        sc.close();
    }
}
