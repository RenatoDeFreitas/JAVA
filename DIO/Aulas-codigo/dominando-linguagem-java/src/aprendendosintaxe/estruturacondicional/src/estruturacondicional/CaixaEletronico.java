package estruturacondicional.src.estruturacondicional;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 300.61;
        double valorSolicitado = 109.42;


        /*  CONDICIONAL COMPOSTA
            -- mais de uma instrução, "linha" necessário bloco! -- 
        */
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual é R$ " + saldo);
        }
        else 
            System.out.println("Saldo insuficiente! - Saldo atual: R$ " + saldo);        
        }  

}
