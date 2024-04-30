public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        // pegando os valores no métodos e colocando no main
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();

        smartTv.mudarCanal(5);

        // traduzindo para Português situação da TV (ligada/desligada)
        String statusTV = (smartTv.ligada == false) ? "Desligada" : "TV Ligada, divirta-se!";

        System.out.println();
        System.out.println("Status da TV: " + statusTV);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println();

        // chama o método - aula
        smartTv.ligar();
        System.out.println("Sua TV está ligada.  " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV está desligada. " + smartTv.ligada);

    }
}
