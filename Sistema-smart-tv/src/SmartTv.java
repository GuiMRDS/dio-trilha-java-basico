public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        System.out.println("Aumendando o volume");
        volume++;
    }
    public void diminirVolume() {
        System.out.println("Diminindo o volume");
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }
    
    public void diminirCanal() {
        canal--;
    }


    public void ligar() {
        ligada=true;
    }
    public void desligar() {
        ligada=false;
    }
}
