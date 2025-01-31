import java.util.Scanner;

public class ex17 {
    // Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura
    // correspondente em grau Celsius. Imprima na tela as duas temperaturas.
    // Fórmula: C = (5 * ( F-32) / 9)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de temperatura, Fahrenheit - Celsius");
        System.out.println("Temperatura em Fahrenheit:");
        double tempF = sc.nextDouble();

        double tempC = (5 * (tempF - 32) / 9);

        System.out.printf("%.2f Fahrenheit são %.2f graus Celsius", tempF, tempC);

        sc.close();
    }
}
