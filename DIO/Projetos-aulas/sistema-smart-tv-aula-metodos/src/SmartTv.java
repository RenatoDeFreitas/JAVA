public class SmartTv {

    // Atributos -> variáveis
    boolean ligada = true;
    int canal = 1;
    int volume = 15;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    // Metodos - manipular os dados - os estados do objeto

    // Liga - desliga
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // volume - abaixa volume
    public void aumentarVolume() {
        volume++;
    }

    public void abaixarVolume() {
        volume--;
    }

    // trocar de canal
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

}
