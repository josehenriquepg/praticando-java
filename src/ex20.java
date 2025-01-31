import java.util.Random;

public class ex20 {
    // Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(101);

        System.out.println("Número aleatório gerado: " + num);
    }
}
