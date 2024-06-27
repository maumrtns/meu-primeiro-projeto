public class CalculadoraIMC {
    public static void main(String[] args) {
        // peso div (altura * altura)

        //pode também ser Float igual a aula
        double peso = 79.9;
        double altura = 1.87;

        double imc = peso / (altura * altura);
        //Dica para não deixar o double com números infinitos
        String imcFormatado = String.format("%.2f", imc);

        System.out.println("Seu IMC é de: " + imcFormatado);
    }
}
