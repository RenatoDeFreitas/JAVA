
public class ExemploForArrey {
    public static void main(String[] args) {
    String alunos [] = { "Camila", "Jussara", "Alberto", "Zozimar", "Cristina", "Kelly"};
        // array índice começa no 0
        for(int inicial = 0; inicial < alunos.length; inicial++){
            System.out.println("Aluno na posição "+ inicial + " é " + alunos[inicial]);

            System.out.println();
        }
        // otimizar busca pelos nomes
        String carros [] = {"Opala", "Passat", "Monza", "Fusca", "Chevet", "Fiat 147"};
        for(String carro: carros){
            System.out.println("Nome do carro: " + carro);

        }

    }
}
