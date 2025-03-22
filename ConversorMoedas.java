import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em reais: ");
        double reais = scanner.nextDouble();

        System.out.println("Escolha a moeda para converter: \n1 - Dólar\n2 - Euro\n3 - Libra");
        int opcao = scanner.nextInt();
        double convertido = 0;

        switch (opcao) {
            case 1:
                convertido = reais / 5.7385; // Dólar: R$ 5,7385
                System.out.println("Valor em dólares: " + convertido);
                break;
            case 2:
                convertido = reais / 6.2735; // Euro: R$ 6,2735
                System.out.println("Valor em euros: " + convertido);
                break;
            case 3:
                convertido = reais / 7.2934; // Libra: R$ 7,2934 (aproximadamente)
                System.out.println("Valor em libras: " + convertido);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    
        scanner.close();
    }
}
