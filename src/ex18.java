public class ex18 {
    // Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
        }
    }
}
