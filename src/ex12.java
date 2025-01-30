import java.util.Scanner;

public class ex12 {
    // Faça um algoritmo que leia o valor de um produto e determine o valor que
    // deve ser pago, conforme a escolha da forma de pagamento
    // pelo comprador e imprima na tela o valor final do produto a ser pago.
    // Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
    // Tabela de Código de Condições de Pagamento
    // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    // 2 - À Vista no cartão de crédito, recebe 10% de desconto
    // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Descontos.");
        System.out.println("Valor do produto:");
        double valorProduto = sc.nextDouble();

        System.out.println("Forma de pagamento:");
        System.out.println("1 - Dinheiro ou Pix.");
        System.out.println("2 - Cartão de Crédito.");
        System.out.println("3 - Dividido em 2x.");
        System.out.println("4 - Dividido em 3x.");
        int formaPag = sc.nextInt();

        double valorFinal;

        switch (formaPag) {
            case 1:
                valorFinal = valorProduto - (valorProduto * 15 / 100);
                System.out.printf("O valor final com 15 por cento de desconto será: %.2f", valorFinal);
                break;
            case 2:
                valorFinal = valorProduto - (valorProduto * 10 / 100);
                System.out.printf("O valor final com 10 por cento de desconto será: %.2f", valorFinal);
                break;
            case 3:
                valorFinal = valorProduto / 2;
                System.out.printf("O pagamento será de 2 parcelas sem juros de: %.2f", valorFinal);
                break;
            case 4:
                valorFinal = (valorProduto + (valorProduto * 10/ 100)) / 3;
                System.out.printf("O pagamento será de 3 parcelas com juros de: %.2f", valorFinal);
                break;
            default:
                System.out.print("Opção inválida");
        }

        sc.close();
    }
}
