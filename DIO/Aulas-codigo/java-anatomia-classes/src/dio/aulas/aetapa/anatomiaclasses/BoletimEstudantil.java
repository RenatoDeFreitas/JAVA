package dio.aulas.aetapa.anatomiaclasses;
public class BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 7; 

        if (mediaFinal < 6)
            System.out.println("reprovado");
        else if (mediaFinal == 6)
            System.out.println("prova de minerva");
        else
            System.out.println("aprovado");
    }

}
