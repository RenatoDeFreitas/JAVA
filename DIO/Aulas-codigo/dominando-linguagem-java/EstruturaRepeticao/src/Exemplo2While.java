import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exemplo2While {
    public static void main(String[] args) {
       
    Scanner entrada = new Scanner(System.in);
    System.out.println("Qual o em saldo? ");
    String entradaDados = entrada.nextLine();
    float saldoAtual = Float.parseFloat (entradaDados);   // convertendo String em Float
    
    while (saldoAtual > 0) {
        float produto = precoAleatorio();
        if (produto > saldoAtual) {
           System.out.println();
            System.out.println("Valor produto R$ " +produto);
            System.out.println("Seu saldo é R$ " + saldoAtual);
            System.out.println();
            System.out.println("Saldo insuficiente");
            break;            
        }
        else{
            System.out.println("Valor da compra R$ "+ produto);
            saldoAtual = saldoAtual - produto;
        }
        System.out.println(" Saldo R$ " + saldoAtual);
        
    }
    System.out.println();
    System.out.println("Seu saldo final é R$ "+saldoAtual);
    System.out.println();
    entrada.close();
    }
    

private static float precoAleatorio(){
    return ThreadLocalRandom.current().nextFloat(2, 11);
}
}
