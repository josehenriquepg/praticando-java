import java.util.Scanner;

public class ex11 {
    // Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a
    // média das nota obtidas, imprima na tela o nome do aluno e
    // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
    // sua média final deve ser maior ou igual a 7.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aprovação dos alunos.");
        System.out.println("Nome do aluno:");
        String nomeAluno = sc.next();
        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota:");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.print("Aluno " + nomeAluno + " foi APROVADO!!!");
        } else {
            System.out.print("Aluno " + nomeAluno + " foi REPROVADO!!!");
        }

        sc.close();
    }
}
