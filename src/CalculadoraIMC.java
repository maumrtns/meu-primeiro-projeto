import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        // peso div (altura * altura)

        //pode também ser Float igual a aula
        System.out.println("Digite o seu peso (em kilos): ");
        float peso = leitorTeclado.nextFloat();
        System.out.println("Digite sua altura (em centimetros):");
        float altura = leitorTeclado.nextFloat();

        float resultado = peso / (altura * altura);

        System.out.println(
                "O IMC para o peso " + peso + " , e altura de "
                        + altura + " é " + resultado);

        leitorTeclado.close();
    }
}
