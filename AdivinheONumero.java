import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;
        System.out.println("Tente adivinhar o número (entre 1 e 10): ");
        int palpite = scanner.nextInt();

        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Errado! O número era " + numeroSecreto);
        }

        scanner.close();
    }
}
