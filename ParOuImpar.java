import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaPar = 0, somaImpar = 0, num;

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            num = scanner.nextInt();

            if (num == 0) {
                break; // Sai do loop quando o usuário digitar 0
            }

            if (num % 2 == 0) {
                somaPar += num;
                System.out.println(num + " é par.");
            } else {
                somaImpar += num;
                System.out.println(num + " é ímpar.");
            }
        }

        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);
        scanner.close();
    }
}
