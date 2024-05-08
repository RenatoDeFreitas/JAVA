import java.util.Scanner;

public class ValidacaoProcessoSeletivo {
    public static void main(String[] args) {
       
       // entrada de dados
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nomeCandidato = entradaDados.nextLine();
        
        System.out.println("Informe o salário pretendido.");
        String salarioDesejado = entradaDados.nextLine();

        // transformar em double
        Double salarioPretendido = Double.parseDouble(salarioDesejado);

       analisarCandidato(salarioPretendido);

        entradaDados.close();
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 3200.0;
        if (salarioBase > salarioPretendido) {
            System.out.println ("Ligar para o candidato. Seu salário é " + salarioPretendido);
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("Ligar e fazer contraproposta.");
        }
        else {
            System.out.println("Aguardar resultado dos demais candidatos.");
        }
    }
}
