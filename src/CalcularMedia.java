import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro trimestre");
        int nota1 = teclado.nextInt();
        System.out.println("Digite a nota do segundo trimestre");
        int nota2 = teclado.nextInt();
        System.out.println("Digite a nota do terceiro trimestre");
        int nota3 = teclado.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media para o Aluno é: " + media);
        teclado.close();
    }
}
