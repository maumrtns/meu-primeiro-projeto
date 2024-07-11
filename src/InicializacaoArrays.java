public class InicializacaoArrays {
    public static void main(String[] args) {

        String nome = "Fulano da silva";
        String telefone1 = "1125854878";
        String telefone2 = "2186978545";

        String[] filhos = {"Zé", "Maria", "Pedro", "Rita"};

        System.out.println(filhos[3]);
        System.out.println(filhos[2]);
        System.out.println(filhos[1]);
        System.out.println(filhos[0]);

        String nomePrimeiroFilho = filhos[0];
        String nomeSegundoFilho = filhos[1];

        String[] telefones = new String[2];
        //Lembra dos @ValoresPadrao
        System.out.println("Telefone 1 quando Array está vazio: " + telefones[0]);


        telefones[0] = "40228922";
        telefones[1] = "1125787845";

        System.out.println("Primeiro Telefone: " + telefones[0]);
        System.out.println("Segundo Telefone: " + telefones[1]);

        int[] outrosNumeros = new int[5];
        System.out.println("Valor: " + outrosNumeros[0]);
    }
}
