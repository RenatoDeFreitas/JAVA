package aprendendosintaxe.tiposevariaveis;
public class TiposDeVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // cast - operação usada para converter um tipo de dado em outro tipo compatível
      
        System.out.println(numeroCurto2);


        int numero = 5;
        numero = 10;

		System.out.print("A variável agora é "+numero);
        
        final double VALOR_DE_PI = 3.14;  // fixa o valor da constante
		
        
        System.out.println();
        System.out.print("A variável agora é "+numero);
        System.out.println("valor de PI é "+ VALOR_DE_PI);
        
        
    }
}
