package dio.aulas.aetapa.anatomiaclasses;

public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Olá mundo! Bora aprender, porque quem sabe faz a hora!");

        final int ANO = 2021; // Final deixa o valor imutável ou MAIÚSCULA

        // Atribuindo variável
        String meuNome = "Renato";
        int anoFabricacao = 2024;
        boolean verdadeira = true;

        String primeiroNome = "Carlos";
        String segundoNome = "Fabrício";

        // criado um método (operação qualquer) para retornar um valor dentro do
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // prints
        System.out.println(ANO);
        System.out.println(meuNome);
        System.out.println(anoFabricacao);
        System.out.println(verdadeira);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
