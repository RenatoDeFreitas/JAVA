package aprendendosintaxe.operadores;

public class OpRelacional {
    public static void main(String[] args) {
        int numero1 = 8;
        int numero2 = 2;

        boolean SimNao = numero1 == numero2;
        
        System.out.println();
        System.out.println("Numero 1 é IGUAL ao númro 2? "+ SimNao);
        
        SimNao = numero1 != numero2;
        System.out.println("Numero 1 é DIFERENTE ao númro 2? "+ SimNao);
        
        SimNao = numero1 > numero2;
        System.out.println("Numero 1 é MAIOR ao númro 2? "+ SimNao);
    
    
        System.out.println();
    }
}
