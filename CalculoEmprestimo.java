import java.util.Scanner;

public class CalculoEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double valor = scanner.nextDouble();

        System.out.println("Escolha o número de parcelas (6, 12 ou 24): ");
        int parcelas = scanner.nextInt();
        double total = valor;

        switch (parcelas) {
            case 6:
                total += valor * 0.05;
                break;
            case 12:
                total += valor * 0.10;
                break;
            case 24:
                total += valor * 0.20;
                break;
            default:
                System.out.println("Número de parcelas inválido.");
                return;
        }

        System.out.println("Valor total a pagar: R$ " + total);
        scanner.close();
    }
}
