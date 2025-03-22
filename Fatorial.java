import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Número inválido! Digite um número positivo.");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + num + " é: " + fatorial);
        }

        scanner.close();
    }
}
