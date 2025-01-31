import java.util.Scanner;

public class ex06 {
    //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que deseja reajustar:");
        int x = sc.nextInt();

        int reajuste = x + (x * 5/100);

        System.out.print("O reajuste de 5% será: " + reajuste);

        sc.close();
    }
}
