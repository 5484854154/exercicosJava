import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, contador = 0, num;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = scanner.nextInt();
            if (num != 0) { 
                soma += num;
                contador++;
            }
        } while (num != 0);

        if (contador > 0) { 
            double media = (double) soma / contador;
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}
