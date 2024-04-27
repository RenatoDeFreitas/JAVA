package aprendendosintaxe.operadores;

public class OpUnarios {
    public static void main(String[] args) {

        int valor1 = 5;

    // altera para negativo como
        valor1 = -valor1; 
        System.out.println(valor1);


    //incremento
        int valor2 = 5;
        valor2 ++;          //valor2 = valor2 +1  atentar para antes de depois 
                            //(++ valor2)

        System.out.println(valor2);
      
        //negação de boolean

        boolean questao = true;
        questao = ! questao;

        System.out.println(!questao);
        System.out.println(questao);

       


    }
}
