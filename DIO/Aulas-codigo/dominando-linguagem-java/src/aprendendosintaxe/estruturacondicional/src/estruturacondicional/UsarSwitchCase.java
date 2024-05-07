package estruturacondicional.src.estruturacondicional;

/* Usando - Switch Case  + Condicional Ternário Encadeada */
import java.util.Locale;
import java.util.Scanner;

public class UsarSwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Inserir a sigla de avaliação do projeto. B = bom, M = médio, R = ruim");
        String siglaAvaliacao = scanner.nextLine();

        int notaReferencia = 0;
        switch (siglaAvaliacao) {
            case "B": {
                System.out.println("BOM");
                notaReferencia = 5;
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                notaReferencia = 3;
                break;
            }
            case "R": {
                System.out.println("RUIM");
                notaReferencia = 1;
                break;
            }
            default:
                System.out.println("Valor indefinido. Atente a instrutção!");

        }
        int valorResultado = notaReferencia == 0 ? 0
                : notaReferencia == 5 ? 5 : notaReferencia == 3 ? 3 : notaReferencia == 1 ? 1 : 0;
        System.out.println();
        // resultado
        System.out.println("Sua avaliação foi letra " + siglaAvaliacao);
        System.out.println("Nota de Referência " + valorResultado);

        scanner.close();
    }
}
