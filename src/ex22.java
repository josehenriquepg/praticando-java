import java.util.Scanner;

public class ex22 {
    // Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
    // As informações fornecidas serão: valor da hora aula, número de aulas lecionadas
    // no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Calculo do salário líquido de professor.");
        System.out.println("Valor hora aula:");
        double valorAula = sc.nextDouble();
        System.out.println("Número de aulas no mês:");
        int numAulas = sc.nextInt();
        System.out.println("Percentual do INSS:");
        double perINSS = sc.nextDouble();

        double salarioBruto = valorAula * numAulas;
        double descontoINSS = (perINSS / 100) * salarioBruto;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto do INSS: R$ %.2f%n", descontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
