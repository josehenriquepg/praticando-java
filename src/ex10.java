import java.util.Scanner;

public class ex10 {
    // Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de média de notas dos alunos.");
        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas é: %.2f", media);

        sc.close();
    }
}
