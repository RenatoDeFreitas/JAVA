import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        /* dados - atributos - variáveis */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor, digite seu nome. ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número e código da agência (exemplo: 000-0.)");
        String numeroAgendia = scanner.next();

        System.out.println("Digite o número da conta (exemplo: 0000).");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o valor do primeiro saldo realisado.");
        double primeiroSaldo = scanner.nextDouble();

        /* Impressão na tela */
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgendia + ", conta " + numeroConta + "e seu saldo de  " + primeiroSaldo
                + " já está disponível para saque. ");
    }
}
