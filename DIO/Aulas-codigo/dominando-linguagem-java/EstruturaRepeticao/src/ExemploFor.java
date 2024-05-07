import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseja contar até qual número?");
        int resposta = teclado.nextInt();

        for(int contadorNumero = 1; contadorNumero <= resposta; contadorNumero++){
            System.out.println("Contando número: " + contadorNumero);
        }
        System.out.println();
        System.out.println( "Fim da contagem! ");
        System.out.println();
    }
}
