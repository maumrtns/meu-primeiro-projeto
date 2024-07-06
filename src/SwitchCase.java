import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double valorTotal = 0;

        do {
            System.out.println("Digite uma opção no menu:");
            System.out.println("1 - Sanduiche (R$ 10,00)");
            System.out.println("2 - Pizza R$ 30,00)");
            System.out.println("3 - Sorvete R$ 5,00)");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Sanduiche");
                    valorTotal += 10;
                    break;
                case 2:
                    System.out.println("Pizza");
                    valorTotal += 30;
                    break;
                case 3:
                    System.out.println("Sorvete");
                    valorTotal += 5;
                    break;
                case 0:
                    System.out.println("Finalizando o pedido!");
                    break;
                default:
                    System.out.println("Escolha uma opção valida");
            }

        } while (opcao != 0);

        System.out.println("O valor total do seu pedido é: " + valorTotal);
        scanner.close();
    }
}
