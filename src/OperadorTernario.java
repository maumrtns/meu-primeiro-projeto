public class OperadorTernario {
    public static void main(String[] args) {

        int idade = 20;
        int idadeMinima = 18;
        int anoNascimento = 2000;

        if (idade > idadeMinima && anoNascimento >= 2000 && idadeMinima < 20) {
            System.out.println("Executa o IF com a lógica do E");
        }

        if (idade > idadeMinima || anoNascimento >= 2000){
            System.out.println("Execute essa lógica do OU");
        }

        String deMaior = idade >= 18 ? "Sim, é de Maior!" : "Não, é de Menor";
        System.out.println(deMaior);

    }
}
