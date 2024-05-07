package estruturacondicional.src.estruturacondicional;
import java.util.Locale;
import java.util.Scanner;

public class resultadoescolar {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Inserir valor da nota.");
        int nota = scanner.nextInt() ; 

        /*CONDICIONAL ENCADEADA */
        if (nota >= 7 ) 
            System.out.println("Aprovado");
            
        else if (nota >= 5 && nota < 7) 
            System.out.println("Recuperação");
            
        else     
            System.out.println("Reprovado.");
        



        
        




        scanner.close();
    }
}
