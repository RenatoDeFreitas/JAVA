import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 10.0;

        while ( mesada >0 ) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce é R$ " + valorDoce + "Add no carrinho");
            mesada = mesada -valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda sua grana!");

    }

    private static double valorAleatorio(){
       return ThreadLocalRandom.current().nextDouble(2, 8); 
    }
}
