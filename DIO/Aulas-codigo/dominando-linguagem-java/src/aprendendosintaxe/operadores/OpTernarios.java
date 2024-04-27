package aprendendosintaxe.operadores;

public class OpTernarios {
    public static void main(String[] args) {
    
    int a, b;

        a = 8;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
       
       int resultado = a < b ? 0: 1;

        System.out.println(resultado);


    }


}
