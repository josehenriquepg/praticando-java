import java.util.Scanner;

public class ex05 {
    // Faça um algoritmo que leia o valor do salário mínimo e o valor do
    // salário de um usuário, calcule quantos salários mínimos esse
    // usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.509,00).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1509.00;

        System.out.println("Digite o seu Salário:");
        double salarioUsuario = sc.nextDouble();

        double quantSM = (salarioUsuario / salarioMinimo);

        System.out.printf("Você ganha: %.2f Salários Mínimos.", quantSM);

        sc.close();
    }
}
