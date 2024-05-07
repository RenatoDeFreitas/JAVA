import java.util.Scanner;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Digite seu nome.");
        String nome = entrada.nextLine();
        System.out.println("Deseja contar até qual númro?");
        int contagem = entrada.nextInt();
        System.out.println("Em qual número deseja parar?");
        int pararContagem = entrada.nextInt();
        System.out.println();

        for(int numero = 1; numero < contagem; numero++){
            if (numero == pararContagem) {
               //System.out.println("Agora vamos parar porque chegamos no número " + numero);
               continue;
            }
            System.out.println(nome+ ", paramos no número " +numero);
        }
        entrada.close();
    }
}
