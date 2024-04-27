public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();

        smartTv.mudarCanal(5);

        System.out.println();
        System.out.println("Estado zero da Tv");
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println();

        // chama o método
        smartTv.ligar();
        System.out.println("TV esta ligada. " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV está desligada. " + smartTv.ligada);

    }
}
