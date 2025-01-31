import java.util.Scanner;

public class ex16 {
    // Faça um algoritmo que leia três valores que representam os três lados de um
    // triângulo e verifique se são válidos, determine se o triângulo é
    // equilátero, isósceles ou escaleno.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra se o triângulo é equilátero, isósceles ou escaleno.");
        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();

        if (valor1 == valor2 && valor2 == valor3){
            System.out.print("Seu triângulo é Equilátero.");
        } else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
            System.out.print("Seu triângulo é Isósceles.");
        } else {
            System.out.print("Seu triângulo é Escaleno.");
        }

        sc.close();
    }
}
