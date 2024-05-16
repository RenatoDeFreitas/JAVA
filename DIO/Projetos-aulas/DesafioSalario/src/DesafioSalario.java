import java.util.Scanner;

public class DesafioSalario {
    public static void main(String[] args) {

        // Entrada - variáveis
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Informe o valor do salário: ");
        double salario = Double.parseDouble(teclado.nextLine());

        System.out.println("Quanto recebe de benefício: ");
        double beneficio = Double.parseDouble(teclado.nextLine());

        System.out.println("Com salário de R$ " + salario + " e benefício de R$ " + beneficio + ".");
        // código
        if (0 < salario && salario <= 1100) {
            salario = salario - (salario * 0.05) + beneficio;
            System.out.println("Desconto de 5%. O valor a receber: R$ " + salario);

        } else if (salario > 1100 && salario <= 2500) {
            salario = salario - (salario * 0.1) + beneficio;
            System.out.println("Desconto de 10%. O valor a receber: R$ " + salario);

        } else {
            salario = salario - (salario * 0.15) + beneficio;
            System.out.println("Desconto de 1%. O valor a receber: R$ " + salario);
        }

        // saída
        /*
         * System.out.println(salario);
         * System.out.println(beneficio);
         */

        teclado.close();
    }
}
