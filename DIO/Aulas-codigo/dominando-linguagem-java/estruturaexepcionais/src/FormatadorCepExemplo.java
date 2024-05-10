public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String CepFormatado = formatarCep ("2036506");
            System.out.println(CepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde a regra de negócio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "2376506-40";
    }
}
