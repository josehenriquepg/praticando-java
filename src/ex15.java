import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ex15 {
    // Faça um algoritmo que leia o ano em que uma pessoa nasceu,
    // imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
    // consideração o ano com 365 dias e o mês com 30 dias.(Ex: 5 anos, 2 meses e 15 dias de vida)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o ano do seu nascimento: ");
        int ano = sc.nextInt();
        System.out.println("Qual o mês do seu nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Qual o dia do seu nascimento: ");
        int dia = sc.nextInt();

        // Criando data de nascimento
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calculando a diferença entre as datas
        Period periodo = Period.between(dataNascimento, dataAtual);

        System.out.printf("Você viveu %d anos, %d meses e %d dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());

        sc.close();
    }
}
