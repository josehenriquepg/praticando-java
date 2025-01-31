import java.util.Scanner;

public class ex23 {
    // Faça um algoritmo que calcule a quantidade de litros de combustível
    // gastos em uma viagem, sabendo que o carro faz 12km com um litro.
    // Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
    // distância percorrida e a quantidade de litros utilizados para fazer a viagem.
    // Fórmula: distância = tempo x velocidade.
    // litros usados = distância / 12.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo de gasto de combustível em uma viagem.");
        System.out.println("Tempo de viagem(Horas):");
        double tempo = sc.nextDouble();
        System.out.println("Velocidade média do veículo(km/h):");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Litros de combustível gastos: %.2f L%n", litrosUsados);

        sc.close();
    }
}
