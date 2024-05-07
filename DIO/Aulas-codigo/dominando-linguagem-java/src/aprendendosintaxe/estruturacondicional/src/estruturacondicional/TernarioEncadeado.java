package estruturacondicional.src.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class TernarioEncadeado {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digitar valor da nota.");
    double notaAluno = scanner.nextDouble();

    String Resultado = notaAluno >= 7.2 ? "Aprovado" : notaAluno >=5 && notaAluno< 7 ? "Recuperação" : "Reprovado" ;



    System.out.println("Valor da nota." + notaAluno + ". Seu resultado é " + Resultado);

    scanner.close();
    }
}
